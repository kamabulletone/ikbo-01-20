package ru.mine;

public class Exception1 {

    public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
        }
        catch(Exception e) {
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        Exception1 a = new Exception1();
        a.exceptionDemo();
    }
}
