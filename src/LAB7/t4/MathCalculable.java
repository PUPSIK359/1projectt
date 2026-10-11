package LAB7.t4;

public interface MathCalculable {
    // Поля интерфейса - всегда константы (public static final)
    double PI = 3.141592653589793;

    // Возведение в степень
    double pow(double base, int exponent);

    // Модуль комплексного числа re + im*i
    double complexAbs(double re, double im);
}
