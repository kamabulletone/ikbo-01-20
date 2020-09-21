package ru.mine;
import javax.swing.*;



public class Var2 extends JFrame{
    Var2(String args) {
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

    public static void main(String[] args) {
        new Var2(args[0]);

//
//        BufferedImage myPicture = ImageIO.read(new File("shark.png"));
//        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//        p.add(picLabel);
    }
}
