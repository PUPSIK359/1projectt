package LAB2.t6;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(3, 4, 2);
        Circle c3 = new Circle(0, 0, 5);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Площадь c1 = " + c1.getArea());
        System.out.println("Длина c1 = " + c1.getLength());


        c2.setR(10);
        c2.setX(1);
        System.out.println("После изменения: " + c2);
        System.out.println("Радиус c2 = " + c2.getR());

        c2.setR(-3);
        System.out.println("Радиус c2 после setR(-3) = " + c2.getR());


        System.out.print("c1 и c2: ");
        c1.compare(c2);
        System.out.print("c1 и c3: ");
        c1.compare(c3);


    }
}
