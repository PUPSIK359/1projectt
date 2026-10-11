package LAB2.t9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Игроков должно быть от 1 до 10");
            return;
        }

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] suits = {"Пик", "Червей", "Бубен", "Треф"};

        String[] deck = new String[52];
        int k = 0;
        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                deck[k] = ranks[r] + " " + suits[s];
                k++;
            }
        }
        //тасовка
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        //расдача карт
        int next = 0;
        for (int p = 1; p <= n; p++) {
            System.out.println("Игрок " + p + ":");
            for (int c = 0; c < 5; c++) {
                System.out.println(deck[next]);
                next++;
            }
            System.out.println();
        }
    }
}