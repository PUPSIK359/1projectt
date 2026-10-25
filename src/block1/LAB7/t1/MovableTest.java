package block1.LAB7.t1;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(1, 1, 6, 5, 2, 3);
        System.out.println("Начало:        " + rect);
        System.out.println("Скорости одинаковые: " + rect.speedTest());

        Movable m = rect;
        m.moveRight();
        System.out.println("После moveRight: " + rect);
        m.moveUp();
        System.out.println("После moveUp:    " + rect);
        m.moveLeft();
        m.moveDown();
        System.out.println("После moveLeft и moveDown: " + rect);

        MovablePoint p1 = new MovablePoint(0, 0, 1, 1);
        MovablePoint p2 = new MovablePoint(5, 4, 2, 1);
        MovableRectangle bad = new MovableRectangle(p1, p2);
        System.out.println("\nДругой прямоугольник: " + bad);
        System.out.println("Скорости одинаковые: " + bad.speedTest());
    }
}
