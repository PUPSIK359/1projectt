package LAB7.t7;

public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году%n", name, author, year);
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                Book b = (Book) printable[i];   // приводим к Book, чтобы вызвать getName()
                System.out.println(b.getName());
            }
        }
    }
}
