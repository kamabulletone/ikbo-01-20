package ru.mine;

import javax.swing.*;
import java.awt.*;

public class draw extends JPanel {
    private Shape[] arr;
    public draw(Shape[] arr) { this.arr = arr;}
    public void drawing() {
        repaint();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

//
        for (int i = 0; i < arr.length; i++) {
            arr[i].print(g);

        }



    }
}
