package LAB1;

import java.util.Arrays;

// Задание 3: массив задаётся инициализацией (как в Си),
// в цикле for считаем сумму и среднее арифметическое.
public class t3 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, -3, 8, 20, 7, 1}; // инициализация массива

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // то же самое, что sum = sum + numbers[i]
        }

        // (double) нужен, чтобы деление было дробным, а не целочисленным
        double average = (double) sum / numbers.length;

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", average);
    }
}