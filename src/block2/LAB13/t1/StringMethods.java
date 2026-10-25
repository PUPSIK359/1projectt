package block2.LAB13.t1;

public class StringMethods {

    public static void process(String s) {
        System.out.println("Исходная строка: " + s);

        System.out.println("Последний символ: " + s.charAt(s.length() - 1));

        System.out.println("Заканчивается на \"!!!\": " + s.endsWith("!!!"));

        System.out.println("Начинается с \"I like\": " + s.startsWith("I like"));

        System.out.println("Содержит \"Java\": " + s.contains("Java"));

        int position = s.indexOf("Java");
        System.out.println("Позиция \"Java\": " + position);

        System.out.println("Замена a -> o: " + s.replace('a', 'o'));

        System.out.println("Верхний регистр: " + s.toUpperCase());

        System.out.println("Нижний регистр: " + s.toLowerCase());

        if (position >= 0) {
            String word = s.substring(position, position + 4);
            String without = s.substring(0, position) + s.substring(position + 4);
            System.out.println("Вырезанная подстрока: " + word);
            System.out.println("Строка без нее: " + without);
        }
    }

    public static void main(String[] args) {
        process("I like Java!!!");
    }
}
