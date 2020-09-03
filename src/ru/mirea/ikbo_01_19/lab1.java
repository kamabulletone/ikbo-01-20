package ru.mirea.ikbo_01_19;

public class lab1 {

    public static void main(String[] args) {
        Ball ball = new Ball(10, "white");
        Book book = new Book(1000, "Black Tower", "1970");
        Dog dog = new Dog(5, "Black and White", "Doge");

        System.out.println("Информация о мяче: " + ball.to_String());
        System.out.println("Информация о книге:" + book.to_String());
        System.out.println("Информация о собаке: " + dog.to_String());

    }
}
