package block1.LAB3.t4;

import java.util.Random;
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Введите размер массива (натуральное число): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Число должно быть больше 0, повторите ввод");
                }
            } else {
                sc.next();
                System.out.println("Это не число, повторите ввод");
            }
        }

        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("Чётных элементов нет");
            return;
        }


        int[] even = new int[evenCount];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[k] = arr[i];
                k++;
            }
        }

        System.out.print("Чётные элементы: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}