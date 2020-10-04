package ru.mine;

public class Task1 {

    public static void main(String[] args) {
	ConcreteFactory fac = new ConcreteFactory();
        System.out.println("Empty complex num: " + fac.createComplex());
        System.out.println("Some complex num: " + fac.CreateComplex(5,10));

    }
}
