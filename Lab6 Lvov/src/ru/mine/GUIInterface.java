package ru.mine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIInterface extends JFrame {
    private JLabel lNorth = new JLabel("NORTH",SwingConstants.CENTER);
    private JLabel lCenter = new JLabel("CENTER",SwingConstants.CENTER);
    private JLabel lRight = new JLabel("RIGHT",SwingConstants.CENTER);
    private JLabel lLeft = new JLabel("LEFT",SwingConstants.CENTER);
    private JLabel lSouth = new JLabel("SOUTH",SwingConstants.CENTER);



    public GUIInterface() {
        super("TestWindow");
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(lNorth, BorderLayout.NORTH);
        this.add(lCenter, BorderLayout.CENTER);
        this.add(lRight, BorderLayout.EAST);
        this.add(lLeft, BorderLayout.WEST);
        this.add(lSouth, BorderLayout.SOUTH);

        lNorth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(GUIInterface.this, "Добро пожаловать в NORTH");

            }
        });

        lCenter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(GUIInterface.this, "Добро пожаловать в CENTER");

            }
        });

        lLeft.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(GUIInterface.this, "Добро пожаловать в Джидда");

            }
        });

        lSouth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(GUIInterface.this, "Добро пожаловать в Абха");

            }
        });

        lRight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(GUIInterface.this, "Добро пожаловать в Дахране");

            }
        });




        setSize(500,400);
        setVisible(true);
    }
}
