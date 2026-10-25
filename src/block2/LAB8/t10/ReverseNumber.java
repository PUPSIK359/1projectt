package block2.LAB8.t10;

import java.util.Scanner;

public class ReverseNumber {

    public static long reverse(long n) {
        return reverse(n, 0);
    }


    private static long reverse(long n, long acc) {

        if (n == 0) {
            return acc;
        }

        return reverse(n / 10, acc * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число без нулей: ");
        long n = sc.nextLong();
        System.out.println("Результат: " + reverse(n));
    }
}
