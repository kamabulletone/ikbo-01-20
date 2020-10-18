package ru.mine;

public class UnhandledPhoneNumber extends Exception {
    UnhandledPhoneNumber(String e) {
        System.out.println(e);
    }
}
