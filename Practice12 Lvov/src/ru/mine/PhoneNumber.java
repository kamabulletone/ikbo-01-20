package ru.mine;

import java.util.Scanner;

public class PhoneNumber {
    String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(number);
        if (b.charAt(0) == '+') {
            b.insert(5,'-');
            b.insert(9,'-');
            b.insert(0,"Phone number is: ");

        }
        else {
            b.replace(0,1, "+7");
            b.insert(5,'-');
            b.insert(9,'-');
            b.insert(0,"Phone number is: ");
        }
        return b.toString();
    }

    public static void main(String[] args) throws UnhandledPhoneNumber {
        /*Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();*/
        String inp = "89166134567";
        if (inp.charAt(0) == '+' && inp.length()-1 == 11) {
            PhoneNumber phone = new PhoneNumber(inp);
            System.out.println(phone.toString());
        }
        else if (inp.charAt(0) == '8' && inp.length() == 11) {
            PhoneNumber phone = new PhoneNumber(inp);
            System.out.println(phone.toString());
        }
        else throw new UnhandledPhoneNumber("Incorrect phone number");




    }
}
