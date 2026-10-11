package LAB7.t4;

public class MathTest {
    public static void main(String[] args) {
        // Переменная интерфейса, объект класса - так можно
        MathCalculable mc1 = new MathFunc();
        // MathCalculable mc2 = new MathCalculable();   // ошибка: объект интерфейса создать нельзя

        System.out.println("2 в степени 10 = " + mc1.pow(2, 10));
        System.out.println("|3 + 4i| = " + mc1.complexAbs(3, 4));
        System.out.println("PI из интерфейса = " + MathCalculable.PI);

        // circleLength объявлен только в классе, поэтому нужна переменная типа MathFunc
        MathFunc f = new MathFunc();
        System.out.println("Длина окружности r=5: " + f.circleLength(5));
    }
}
