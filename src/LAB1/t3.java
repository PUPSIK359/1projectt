package LAB1;

import java.util.Arrays;
//зд3 создаем мссив инициализаице как в ис и в цикле фор считаем сумму и ср ариф

public class t3 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, -3, 8, 20, 7, 1};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        double average = (double) sum / numbers.length;//дабл нужен для дроб деления не целочисл

        System.out.println("массив: " + Arrays.toString(numbers));
        System.out.println("сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}