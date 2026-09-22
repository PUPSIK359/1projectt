package LAB1;

// Задание 7: метод класса, вычисляющий факториал с помощью цикла,
// и проверка его работы.
public class t7 {

    // n! = 1 * 2 * 3 * ... * n, по определению 0! = 1.
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 10, 20};
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + "! = " + factorial(tests[i]));
        }

        if (factorial(5) == 120) {
            System.out.println("Проверка пройдена: 5! = 120");
        } else {
            System.out.println("Ошибка в методе factorial");
        }
    }
}