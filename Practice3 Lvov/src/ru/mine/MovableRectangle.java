package ru.mine;

public class MovableRectangle  implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed,
                            int ySpeed) {

        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }

    @Override
    public String toString() {
        return "MovableRectangle:" +
                "\ntopLeft: x=" + topLeft.x +
                ", y=" + topLeft.y + " Speed: x=" + topLeft.xSpeed
                 + ", y=" + topLeft.ySpeed + "\n" + "bottomRight: x=" +
                bottomRight.x + ", y=" + bottomRight.y + " Speed: x=" +bottomRight.xSpeed
                + ", y=" + bottomRight.ySpeed + "\n";
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    public boolean speedIsEqual() {
        if (topLeft.xSpeed == bottomRight.xSpeed &&
            topLeft.ySpeed == bottomRight.ySpeed)
            return true;
        else return false;
    }
}
