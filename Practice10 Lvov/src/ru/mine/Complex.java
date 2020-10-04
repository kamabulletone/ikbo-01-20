package ru.mine;

public class Complex {
    /*String mainRealNum;
    String secondReamNum;
    String imaginaryPart;
    String operation;*/
    int real;
    int image;

    /*public Complex(String mainRealNum, String secondReamNum,String operation , String imaginaryPart) {
        this.mainRealNum = mainRealNum;
        this.secondReamNum = secondReamNum;
        this.operation = operation;
        this.imaginaryPart = imaginaryPart;
    }*/
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        this.real = 0;
        this.image = 0;

    }


    /*public String getComplex() {
        return mainRealNum + " " + operation + " " + secondReamNum + imaginaryPart;
    }*/

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real + ", image=" + image + '}';
    }
}
