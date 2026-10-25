package block1.LAB6.t10;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int size) {
        computers = new Computer[size];
        count = 0;
    }

    public void addComputer(Computer c) {

        for (int i = 0; i < count; i++) {
            if (computers[i].getNumber() == c.getNumber()) {
                System.out.println("Компьютер с номером " + c.getNumber() + " уже есть");
                return;
            }
        }
        if (count < computers.length) {
            computers[count] = c;
            count++;
            System.out.println("Компьютер добавлен");
        } else {
            System.out.println("Каталог магазина заполнен, компьютер не добавлен");
        }
    }

    public void removeComputer(int number) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (computers[i].getNumber() == number) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Компьютера с номером " + number + " нет");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            computers[i] = computers[i + 1];
        }
        computers[count - 1] = null;
        count--;
        System.out.println("Компьютер удалён");
    }

    public void findByBrand(Brand brand) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand() == brand) {
                System.out.println(computers[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Компьютеров марки " + brand + " нет");
        }
    }


    public void findByMinRam(int minRam) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (computers[i].getMemory().getSize() >= minRam) {
                System.out.println(computers[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Компьютеров с памятью от " + minRam + " ГБ нет");
        }
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Каталог пуст");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
    }
}
