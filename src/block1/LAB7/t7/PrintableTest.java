package block1.LAB7.t7;

public class PrintableTest {
    public static void main(String[] args) {

        Printable[] items = {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Magazine("Хакер"),
                new Book("Отцы и дети", "И. Тургенев", 1862),
                new Magazine("Компьютерра")
        };

        System.out.println("Все объекты:");
        for (int i = 0; i < items.length; i++) {
            items[i].print();
        }

        System.out.println("\nТолько книги:");
        Book.printBooks(items);

        System.out.println("\nТолько журналы:");
        Magazine.printMagazines(items);
    }
}
