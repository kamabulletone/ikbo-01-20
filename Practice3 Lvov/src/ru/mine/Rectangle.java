package ru.mine;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public void Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.width = 100;
        this.length = 200;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;

    }
    public Rectangle(double width,double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Shape: Rectangle, width: "+this.width
                + ", length: " + this.length + ", color: "+this.color;
    }
}
