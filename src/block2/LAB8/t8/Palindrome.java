package block2.LAB8.t8;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово из строчных латинских букв:");
        String word = sc.next();

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
