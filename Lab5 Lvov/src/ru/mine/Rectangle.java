package ru.mine;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle() {}
    public Rectangle (int x, int y, int width, int height, Color color) {
        super(x,y,width,height,color);
    }



    public void print(Graphics g) {

        g.setColor(color);
        g.fillRect(x,y,height,width);
    }

}
