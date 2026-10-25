package block1.LAB4.t3;

public class Cart {
    private Product[] items;
    private int count;

    public Cart(int size) {
        items = new Product[size];
        count = 0;
    }

    public void add(Product p) {
        if (count < items.length) {
            items[count] = p;
            count++;
            System.out.println("Добавлено в корзину: " + p.getName());
        } else {
            System.out.println("Корзина заполнена");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].getPrice();
        }
        return sum;
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            items[i] = null;
        }
        count = 0;
    }
}
