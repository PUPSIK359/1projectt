package LAB7.t1;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Конструктор с координатами: обе точки получают одинаковую скорость
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Конструктор с готовыми точками (скорости могут оказаться разными)
    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Проверка: у обеих точек одинаковая скорость по x и по y
    public boolean speedTest() {
        if (topLeft.getXSpeed() == bottomRight.getXSpeed()) {
            if (topLeft.getYSpeed() == bottomRight.getYSpeed()) {
                return true;
            }
        }
        return false;
    }

    // Прямоугольник двигается, когда двигаются обе его точки
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }
}
