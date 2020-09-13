package ru.mine;

import java.awt.*;

public class Oval extends Shape {
    public Oval(int x, int y, int width, int height, Color color) {
        super(x,y,width,height, color);
    }
    public Oval() {}
    public void print(Graphics g) {

        g.setColor(this.color);
        g.fillOval(x,y,width,height);
    }
}
