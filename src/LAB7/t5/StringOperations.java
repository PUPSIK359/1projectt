package LAB7.t5;

public interface StringOperations {
    // Общее количество символов в строке
    int countChars(String s);

    // Сколько раз в строке встречается символ c
    int countChar(String s, char c);

    // Строка из символов на нечётных позициях: 1, 3, 5, ...
    String oddPositions(String s);

    // Строка в обратном порядке
    String reverse(String s);
}
