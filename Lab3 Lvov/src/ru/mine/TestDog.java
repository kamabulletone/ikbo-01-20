package ru.mine;

public class TestDog {

    public static void main(String[] args) {
        Bulldog dog = new Bulldog("Шарик", 8);
        Husky doge = new Husky("Хати", 5);
        Shepherd dogge = new Shepherd("Ракета", 9);
        System.out.println(dog + "\n");
        System.out.println(doge + "\n");
        System.out.println(dogge);
    }
}
