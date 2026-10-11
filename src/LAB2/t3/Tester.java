package LAB2.t3;

public class Tester {

    private Circle[] circles;
    private int count;

    public Tester( int size ){
        circles = new Circle[size];
        count = 0;
    }
    public void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count] = c;
            count++;
        } else {
            System.out.println("массив заполнен, окружность не добавлена");
        }
    }

    public void printAll(){
        System.out.println("всего окружностей: " + count);
        for(int i = 0; i < count; i++){
            System.out.println(circles[i]);
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String [] args){
        Tester N = new Tester(3);
        N.addCircle(new Circle(new Point(0,0),6));
        N.addCircle(new Circle(new Point(2,4),10));

        Point p = new Point(-1, 7);
        Circle c3 = new Circle(p, 10);
        N.addCircle(c3);


        N.addCircle(new Circle(new Point(1, 1), 1));

        N.printAll();

        System.out.println("X центра третьей окружности: " + c3.getCenter().getX());

    }
}
