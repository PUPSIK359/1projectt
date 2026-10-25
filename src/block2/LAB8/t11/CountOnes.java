package block2.LAB8.t11;

import java.io.IOException;

public class CountOnes {


    private static int readInt() throws IOException {
        int c = System.in.read();
        while (c != -1 && (c < '0' || c > '9')) {
            c = System.in.read();
        }
        int result = 0;
        while (c >= '0' && c <= '9') {
            result = result * 10 + (c - '0');
            c = System.in.read();
        }
        return result;
    }


    public static int countOnes() throws IOException {
        int x = readInt();
        if (x == 0) {
            int y = readInt();

            if (y == 0) {
                return 0;
            }

            if (y == 1) {
                return 1 + countOnes();
            }
            return countOnes();
        }
        if (x == 1) {
            return 1 + countOnes();
        }
        return countOnes();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Вводите числа (по одному в строке), конец - два нуля подряд:");
        System.out.println("Единиц: " + countOnes());
    }
}
