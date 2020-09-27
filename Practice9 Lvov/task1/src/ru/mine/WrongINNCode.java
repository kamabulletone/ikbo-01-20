package ru.mine;

public class WrongINNCode extends Exception{
    public WrongINNCode(String error) {
        System.out.println(error);
    }


}
