package LAB1;

import java.util.Scanner;

// Задание 4: массив вводится с клавиатуры, сумма считается
// циклами while и do while, ищутся максимум и минимум.
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько элементов в массиве? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше нуля.");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Сумма через while (цикл с предусловием)
        int sumWhile = 0;
        int i = 0;
        while (i < n) {
            sumWhile += arr[i];
            i++;
        }

        // Сумма через do while (цикл с постусловием)
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < n);

        // Поиск максимума и минимума
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < n; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
            if (arr[k] < min) {
                min = arr[k];
            }
        }

        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}