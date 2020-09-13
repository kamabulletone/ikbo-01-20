package ru.mine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Var1  {

public static void main(String[] args) {
    JFrame frame = new JFrame("Shapes");
    frame.setSize(1000,800);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Shape[] shapes = new Shape[20];
//    shapes[0] = new Rectangle(10, 15, 50, 100, Color.BLUE);
//    shapes[1] = new Oval(100, 15, 100, 100, Color.red);
    for (int i = 0; i < shapes.length; i++) {
        int xr = 10 + (int)(Math.random() * 1001);
        int yr = 10 + (int)(Math.random() * 801);
        int widthr = 50 + (int)(Math.random() * 101);
        int heightr = 50 + (int)(Math.random() * 101);
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color color = new Color(r,g,b);
        if (i % 2 == 0) {
            shapes[i] = new Rectangle(xr,yr,widthr,heightr,color);
        }
        else shapes[i] = new Oval(xr,yr,widthr,heightr,color);


    }
    draw object = new draw(shapes);
    frame.add(object);

    object.drawing();


    frame.setVisible(true);


}

}
