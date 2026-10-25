package block1.LAB2.t4;

import java.util.Scanner;

public class TestShop {

    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("введите количество компьютеров в каталоге: ");
        int n = sc.nextInt();
        Shop shop = new Shop(n);

        for(int i = 0; i < n; i ++){

            System.out.println("Введите номер, модель и RAM через пробел: ");
            Computer c = new Computer(sc.nextInt(),sc.next(),sc.nextInt());
            shop.AddComputer(c);
        }
        shop.printAll();

        System.out.println("введите номер компа который хотите удалить(ЕСЛИ НЕ ХОТИТЕ ВВЕДИТЕ 0 )");//нифига я бтв выдумал движуху с 0)))
        int d = sc.nextInt();
        if (d != 0 ) {
            shop.DelComputer(d);
            shop.printAll();
        }


        System.out.println("введите модель компа который хотите отыскать(для выхода напишите 'выход' ");
        String exit = "выход";
        String m = sc.next();
        if (m.equalsIgnoreCase(exit) != true){
            shop.findComputer(m);
        }

    }
}
