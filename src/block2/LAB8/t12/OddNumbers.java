package block2.LAB8.t12;

import java.io.IOException;

public class OddNumbers {

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

    public static void printOdd() throws IOException {
        int x = readInt();
        if (x == 0) {
            return;
        }
        if (x % 2 == 1) {
            System.out.println(x);
        }
        printOdd();
    }

    public static void main(String[] args) throws IOException {
        printOdd();
    }
}
