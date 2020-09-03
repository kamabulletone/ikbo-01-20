package ru.mirea.ikbo_01_19;

public class Ball {

    private int radius; //cm
    private String color;

    public String to_String() {
        return radius + " " + color;
    }

    public Ball () {
        this.radius = 0;
        this.color = "";
    }
    public Ball (int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
