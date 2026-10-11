package LAB7.t4;

public class MathTest {
    public static void main(String[] args) {

        MathCalculable mc1 = new MathFunc();

        System.out.println("2 в степени 10 = " + mc1.pow(2, 10));
        System.out.println("|3 + 4i| = " + mc1.complexAbs(3, 4));
        System.out.println("PI из интерфейса = " + MathCalculable.PI);

        MathFunc f = new MathFunc();
        System.out.println("Длина окружности r=5: " + f.circleLength(5));
    }
}
