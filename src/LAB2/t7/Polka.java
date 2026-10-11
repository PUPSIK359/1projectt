package LAB2.t7;

public class Polka {
    private Book[] books;
    private int count;

    public Polka(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
        } else {
            System.out.println("Полка заполнена, книга не добавлена");
        }
    }

    public Book getLatest() {
        if (count == 0) {
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

    public Book getEarliest() {
        if (count == 0) {
            return null;
        }
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Полка пуста");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}