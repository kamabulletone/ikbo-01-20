package ru.mine;

public class Hand extends Human{
    private int numOfFingers;

    public Hand(String name, String skinColor, int numOfFingers) {
        super(name,skinColor);
        this.numOfFingers = numOfFingers;
    }
    public void turnLeft() {
        System.out.println(name + "turned left");
    }
    public void turnRight() {
        System.out.println(name + "turned right");
    }
}
