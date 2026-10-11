package LAB4.t3;

import java.util.Scanner;

public class OnlineShop {

    static void printCategories() {
        for (Category c : Category.values()) {
            System.out.println((c.ordinal() + 1) + " - " + c.getTitle());
        }
    }

    static Category chooseCategory(Scanner sc) {
        printCategories();
        System.out.print("Номер каталога: ");
        int n = sc.nextInt();
        if (n < 1 || n > Category.values().length) {
            System.out.println("Нет такого каталога");
            return null;
        }
        return Category.values()[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Authenticator auth = new Authenticator();
        boolean ok = false;
        int attempts = 0;
        while (!ok && attempts < 3) {
            System.out.print("Логин: ");
            String login = sc.next();
            System.out.print("Пароль: ");
            String password = sc.next();
            if (auth.check(login, password)) {
                ok = true;
            } else {
                attempts++;
                System.out.println("Неверный логин или пароль");
            }
        }
        if (!ok) {
            System.out.println("Доступ закрыт");
            return;
        }
        System.out.println("Добро пожаловать!");

        // Наполняем магазин товарами
        Store store = new Store(30);
        store.addProduct(new Product(1, "Смартфон", 29990, Category.ELECTRONICS));
        store.addProduct(new Product(2, "Наушники", 4990, Category.ELECTRONICS));
        store.addProduct(new Product(3, "Ноутбук", 69990, Category.ELECTRONICS));
        store.addProduct(new Product(4, "Мастер и Маргарита", 650, Category.BOOKS));
        store.addProduct(new Product(5, "Война и мир", 1200, Category.BOOKS));
        store.addProduct(new Product(6, "Футболка", 1500, Category.CLOTHES));
        store.addProduct(new Product(7, "Джинсы", 3500, Category.CLOTHES));

        Cart cart = new Cart(20);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n1 - Список каталогов");
            System.out.println("2 - Товары каталога");
            System.out.println("3 - Добавить товар в корзину");
            System.out.println("4 - Показать корзину");
            System.out.println("5 - Купить товары из корзины");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printCategories();
                    break;
                case 2:
                    Category c = chooseCategory(sc);
                    if (c != null) {
                        store.printProducts(c);
                    }
                    break;
                case 3:
                    System.out.print("Введите номер товара: ");
                    int id = sc.nextInt();
                    Product p = store.findById(id);
                    if (p == null) {
                        System.out.println("Товара с таким номером нет");
                    } else {
                        cart.add(p);
                    }
                    break;
                case 4:
                    if (cart.isEmpty()) {
                        System.out.println("Корзина пуста");
                    } else {
                        cart.printAll();
                        System.out.printf("Итого: %.2f руб.%n", cart.getTotal());
                    }
                    break;
                case 5:
                    if (cart.isEmpty()) {
                        System.out.println("Корзина пуста, покупать нечего");
                    } else {
                        cart.printAll();
                        System.out.printf("К оплате: %.2f руб.%n", cart.getTotal());
                        System.out.println("Спасибо за покупку!");
                        cart.clear();
                    }
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
