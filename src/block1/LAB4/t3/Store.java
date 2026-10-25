package block1.LAB4.t3;

public class Store {
    private Product[] products;
    private int count;

    public Store(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Каталог магазина заполнен");
        }
    }


    public void printProducts(Category c) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (products[i].getCategory() == c) {
                System.out.println(products[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("В этом каталоге пока нет товаров");
        }
    }


    public Product findById(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        return null;
    }
}
