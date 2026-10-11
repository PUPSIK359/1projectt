package LAB3.t1;

import java.util.Random;

public class RandomArrays {

    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f  ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8;

        //через метод матф рандом
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 100;
        }
        System.out.println("Math.random() до сортировки:");
        print(a);
        sort(a);
        System.out.println("Math.random() после сортировки:");
        print(a);

        //через класс рандом
        Random rand = new Random();
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = rand.nextDouble() * 100;
        }
        System.out.println("\nRandom до сортировки:");
        print(b);
        sort(b);
        System.out.println("Random после сортировки:");
        print(b);
    }
}