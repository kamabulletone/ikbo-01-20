package ru.mine;

public class Square extends Rectangle{


    public void Square() {
        this.filled = false;
        this.color = "blue";
        this.width = 200;
        this.length = 200;
    }

    public Square(double side) {
        super(side, side);
        this.filled = false;
        this.color = "blue";

    }
    public Square(double side,String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;

    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return "Shape: Square, side: "+this.width + ", color: "+this.color;
    }
}
