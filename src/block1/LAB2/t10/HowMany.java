package block1.LAB2.t10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = sc.nextLine();

        int words = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Количество слов: " + words);
    }
}