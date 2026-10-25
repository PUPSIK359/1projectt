package block1.LAB2.t3;

public class Circle {
    private Point center ;
    private double r;

    public Circle(Point center, double r ){
        this.center = center;
        this.r = r;

    }

    public double getR() {
        return r;
    }
    public void setR(double r ){
        this.r = r;
    }
    public Point getCenter(){
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString(){return "Circle{" + "center=" + center + ", r=" + r + '}';
    }
}
