package LAB7.t5;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();

        StringOperations ops = new ProcessStrings();

        System.out.println("Количество символов: " + ops.countChars(s));
        System.out.println("Количество букв 'а': " + ops.countChar(s, 'а'));
        System.out.println("Символы на нечётных позициях: " + ops.oddPositions(s));
        System.out.println("Строка наоборот: " + ops.reverse(s));
    }
}
