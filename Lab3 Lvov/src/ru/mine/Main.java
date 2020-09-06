package ru.mine;

public class Main {

    public static void main(String[] args) {
        Bulldog dog = new Bulldog("Шарик", 8);
        Husky doge = new Husky("Хати", 5);
        Shepherd dogge = new Shepherd("Ракета", 9);
        System.out.println(dog.toString() + "\n");
        System.out.println(doge.toString() + "\n");
        System.out.println(dogge.toString());
    }
}
