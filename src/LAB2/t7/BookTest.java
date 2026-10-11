package LAB2.t7;

public class BookTest {
    public static void main(String[] args) {

        Book b = new Book("Пушкин", "Евгений Онегин", 1833);
        System.out.println(b);
        b.setYear(1837);
        System.out.println("Год после setYear: " + b.getYear());
        System.out.println("Автор: " + b.getAuthor() + ", название: " + b.getTitle());

        Polka shelf = new Polka(5);
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Булгаков", "Мастер и Маргарита", 1967));
        shelf.addBook(new Book("Гоголь", "Мёртвые души", 1842));
        shelf.addBook(new Book("Достоевский", "Идиот", 1869));

        System.out.println("\nПолка до сортировки:");
        shelf.printAll();

        System.out.println("\nСамая поздняя: " + shelf.getLatest());
        System.out.println("Самая ранняя: " + shelf.getEarliest());

        shelf.sortByYear();
        System.out.println("\nПолка после сортировки по году:");
        shelf.printAll();
    }
}