package ru.mine;

import javax.swing.*;
import java.awt.*;

public class Var1 extends JFrame {
    JPanel[] pnl = new JPanel[20];

    public Var1() {
        setLayout(new GridLayout(4,5));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            
        }
    }

}
