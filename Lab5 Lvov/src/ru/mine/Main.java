package ru.mine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame{
    Main(String args) {
        JLabel background;
        setSize(350,394);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(args);
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0,0,350,394);
        add(background);

        setVisible(true);



    }

    public static void main(String[] args) throws IOException {
        new Main(args[0]);

//
//        BufferedImage myPicture = ImageIO.read(new File("shark.png"));
//        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//        p.add(picLabel);
    }
}
