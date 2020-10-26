package ru.mine;

public class AlreadyAddedOrderException extends Exception {
    public AlreadyAddedOrderException() {
        System.out.println("There is order already");
    }
}
