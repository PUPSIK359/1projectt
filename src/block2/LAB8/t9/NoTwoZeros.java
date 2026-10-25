package block2.LAB8.t9;

import java.util.Scanner;

public class NoTwoZeros {

    public static long count(int a, int b) {

        if (a == 0) {
            return 1;
        }

        if (b == 0) {
            if (a == 1) {
                return 1;
            }
            return 0;
        }

        return count(a, b - 1) + count(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество нулей a: ");
        int a = sc.nextInt();
        System.out.print("Количество единиц b: ");
        int b = sc.nextInt();
        System.out.println("Последовательностей: " + count(a, b));
    }
}
