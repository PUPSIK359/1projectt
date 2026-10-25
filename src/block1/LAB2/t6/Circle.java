package block1.LAB2.t6;
public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public void compare(Circle other) {
        if (r > other.getR()) {
            System.out.println("Эта окружность больше");
        } else if (r < other.getR()) {
            System.out.println("Эта окружность меньше");
        } else {
            System.out.println("Окружности одинакового радиуса");
        }

    }

    @Override
    public String toString(){return "Circle{" + "x=" + x + ", y=" + y + ", r=" + r +'}';
    }
}
