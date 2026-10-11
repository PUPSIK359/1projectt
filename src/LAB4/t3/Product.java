package LAB4.t3;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;

    public Product(int id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %.2f руб.", id, name, price);
    }
}
