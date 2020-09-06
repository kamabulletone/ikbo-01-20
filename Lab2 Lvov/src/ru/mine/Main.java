package ru.mine;

public class Main {

    public static void main(String[] args) {
	Human sam = new Human("Sam", "white", 20);
	Head head = new Head("Head", "white", "round", "black");
        System.out.println(sam.getAge() + sam.getName() + sam.getSkinColor());
        System.out.println(head.getName() + head.getSkinColor() + head.getHairColor());
    }
}
