package LAB1;

//зд6 первые 10 чисел гармонич ряда 1, 1/2, 1/3 ... 1/10
// форматированный выводом через printf
public class t6 {
    public static void main(String[] args) {
        System.out.println("первые 10 членов ряда:");
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n; // ВАЖНО ДЛЯ ДЕЛЕНИЯ
            System.out.printf("%2d) %-5s = %.4f%n", n, "1/" + n, term);
        }
    }
}