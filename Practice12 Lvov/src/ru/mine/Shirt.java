package ru.mine;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shirt {
    private String ID;
    private String type;
    private String color;
    private String size;

    public Shirt(String[] data) {
        this.ID = data[0];
        this.type = data[1];
        this.color = data[2];
        this.size = data[3];
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("----------Item------------\n");
        b.append("ID Продукта: ").append(ID).append("\n");
        b.append("Название продукта: ").append(type).append("\n");
        b.append("Цвет продукта: ").append(color).append("\n");
        b.append("Размер продукта: ").append(size).append("\n");
        return b.toString();
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        String[] data = new String[4];

        int coma1 = 0;
        int coma2 = 0;



        Shirt[] sh = new Shirt[11];
        for (int i = 0; i < shirts.length; i++) {

            for (int j =0; j < 4; j++) {
                if (j == 0) {
                    coma1 = shirts[i].indexOf(',',0);
                    data[j] = shirts[i].substring(0,coma1);
                }
                else if (j == 3) {
                    data[j] = shirts[i].substring(coma1+1);
                }
                else {
                    coma2 = shirts[i].indexOf(',',coma1+1);

                    data[j] = shirts[i].substring(coma1+1,coma2);
                    coma1 = coma2;
                }

            }
            sh[i] = new Shirt(data);

        }
        for (Shirt s : sh) {
            System.out.println(s.toString());
        }


    }


}
