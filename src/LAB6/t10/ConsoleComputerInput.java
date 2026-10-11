package LAB6.t10;

import java.util.Scanner;

// Реализация интерфейса: ввод с клавиатуры
public class ConsoleComputerInput implements ComputerInput {
    private Scanner sc;

    public ConsoleComputerInput(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public Brand readBrand() {
        Brand[] brands = Brand.values();
        for (int i = 0; i < brands.length; i++) {
            System.out.println((i + 1) + " - " + brands[i]);
        }
        System.out.print("Номер марки: ");
        int n = sc.nextInt();
        if (n < 1 || n > brands.length) {
            System.out.println("Нет такой марки");
            return null;
        }
        return brands[n - 1];
    }

    @Override
    public Computer readComputer() {
        System.out.print("Номер компьютера: ");
        int number = sc.nextInt();

        System.out.println("Выберите марку:");
        Brand brand = readBrand();
        if (brand == null) {
            return null;
        }

        System.out.print("Процессор (модель одним словом): ");
        String cpuModel = sc.next();
        System.out.print("Частота, ГГц: ");
        double freq = sc.nextDouble();
        System.out.print("Количество ядер: ");
        int cores = sc.nextInt();

        System.out.print("Объём памяти, ГБ: ");
        int ramSize = sc.nextInt();
        System.out.print("Тип памяти (например, DDR4): ");
        String ramType = sc.next();

        System.out.print("Диагональ монитора, дюймы: ");
        double diagonal = sc.nextDouble();
        System.out.print("Разрешение (например, 1920x1080): ");
        String resolution = sc.next();

        System.out.print("Цена, руб.: ");
        double price = sc.nextDouble();

        return new Computer(number, brand,
                new Processor(cpuModel, freq, cores),
                new Memory(ramSize, ramType),
                new Monitor(diagonal, resolution),
                price);
    }
}
