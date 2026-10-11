package LAB7.t4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexAbs(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }

    // Длина окружности, число PI берётся из интерфейса
    public double circleLength(double r) {
        return 2 * PI * r;
    }
}
