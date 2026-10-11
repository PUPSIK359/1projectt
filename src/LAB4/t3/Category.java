package LAB4.t3;

public enum Category {
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    CLOTHES("Одежда");

    private final String title;

    private Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
