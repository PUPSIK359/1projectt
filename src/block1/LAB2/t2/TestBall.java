package block1.LAB2.t2;

public class TestBall {
    public static void main (String[] args){
        Ball ball1 = new Ball();
        ball1.setXY(3 ,4);
        System.out.println(ball1);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        ball1.move ( 3,4);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());

    }

}
