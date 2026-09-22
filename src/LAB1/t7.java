package LAB1;

// зд7: метод класса, вычисляющий факториал с помощью цикла

public class t7 {

    // n! = 1 * 2 * 3 * ... * n, по определению 0! = 1.
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("факториал отрицательного числа не сущ");
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
            System.out.println("проверка пройдена фактор5 = 120");
        } else {
            System.out.println("ошибка в методе factorial");
        }
    }
}