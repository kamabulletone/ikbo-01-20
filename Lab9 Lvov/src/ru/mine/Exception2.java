package ru.mine;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer ");
        String b = scan.next();
        int i = Integer.parseInt(b);

        //0 java.lang.ArithmeticException:
        // 1.2 java.lang.NumberFormatException
        // 1 - works fine


        try {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Tried divide int by float number");
        }
        finally {
            System.out.println("Anyway i print something");
        }
    }

    public static void main(String[] args) {
        Exception2.exceptionDemo();
    }
}
