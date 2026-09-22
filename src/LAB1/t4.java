package LAB1;

import java.util.Scanner;
//зд4 вводится мас с клавы ищем сумму и мин макс ч/з вайл/ду вайл
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("сколько элементов в массиве? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("количество элементов должно быть больше нуля!!!!!");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("введите элемент " + (i + 1));
            arr[i] = sc.nextInt();
        }

        int sumwhile = 0;
        int i = 0;
        while (i < n) {
            sumwhile += arr[i];
            i++;
        }

        int sumdowhile = 0;
        int j = 0;
        do {
            sumdowhile += arr[j];
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

        System.out.println("сумма вайл: " + sumwhile);
        System.out.println("сумма ду вайл: " + sumdowhile);
        System.out.println("макс элемент: " + max);
        System.out.println("мин элемент: " + min);
    }
}