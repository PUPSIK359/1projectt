package LAB1;

// Задание 6: первые 10 чисел гармонического ряда 1, 1/2, 1/3, ..., 1/10
// с форматированным выводом через printf.
public class t6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n; // 1.0, а не 1, иначе деление будет целым
            System.out.printf("%2d) %-5s = %.4f%n", n, "1/" + n, term);
        }
    }
}