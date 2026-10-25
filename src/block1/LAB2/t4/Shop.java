package block1.LAB2.t4;

public class Shop {
    private Computer [] computers;
    private int count;

    public Shop (int size){
        computers = new Computer [size];
        count = 0;
    }

    public void AddComputer(Computer c){
        if (count < computers.length){
            computers[count] = c;
            count++;
        }
        else {
            System.out.println("каталог магазина заполнен,копмьютер не добавлена");
        }
    }

    public  void DelComputer(int del){
        int index = -1;
        for (int i = 0; i < count ;i++) {
            if (computers[i].getNumber() == del) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Компьютера с номером " + del + " нет");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            computers[i] = computers[i + 1];
        }
        computers[count - 1] = null;
        count--;
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

    public void findComputer(String model) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                System.out.println(computers[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Компьютеров модели " + model + " нет");
        }
    }

}
