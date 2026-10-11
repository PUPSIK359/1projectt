package LAB3.converter;

import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(80.0, 92.0, 11.0);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму в рублях: ");
        double rub = sc.nextDouble();

        System.out.println("Выберите валюту: 1 - USD, 2 - EUR, 3 - CNY");
        int choice = sc.nextInt();

        String code;
        if (choice == 1) {
            code = "USD";
        } else if (choice == 2) {
            code = "EUR";
        } else if (choice == 3) {
            code = "CNY";
        } else {
            System.out.println("Нет такого пункта");
            return;
        }

        double result = converter.convert(rub, code);

        System.out.printf("%,.2f RUB = %,.2f %s%n", rub, result, code);
    }
}
