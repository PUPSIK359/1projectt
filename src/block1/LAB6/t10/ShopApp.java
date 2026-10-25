package block1.LAB6.t10;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop(30);

        ComputerInput input = new ConsoleComputerInput(sc);

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n1 - Добавить компьютер");
            System.out.println("2 - Удалить компьютер по номеру");
            System.out.println("3 - Найти по марке");
            System.out.println("4 - Найти по объёму памяти (от N ГБ)");
            System.out.println("5 - Показать все");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Computer c = input.readComputer();
                    if (c != null) {
                        shop.addComputer(c);
                    }
                    break;
                case 2:
                    System.out.print("Номер компьютера для удаления: ");
                    shop.removeComputer(sc.nextInt());
                    break;
                case 3:
                    Brand b = input.readBrand();
                    if (b != null) {
                        shop.findByBrand(b);
                    }
                    break;
                case 4:
                    System.out.print("Минимальный объём памяти, ГБ: ");
                    shop.findByMinRam(sc.nextInt());
                    break;
                case 5:
                    shop.printAll();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }
}
