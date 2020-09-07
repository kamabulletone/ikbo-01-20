package ru.mine;



public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        if (xSpeed > 0) {
            this.xSpeed = xSpeed;
        }
        else this.xSpeed = -x;
        if (ySpeed > 0) {
            this.ySpeed = ySpeed;
        }
        else this.ySpeed = ySpeed;

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }
}
