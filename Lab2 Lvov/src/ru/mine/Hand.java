package ru.mine;

public class Hand {
    private String name;
    private int numOfFingers;

    public Hand(String name, int numOfFingers) {
        this.numOfFingers = numOfFingers;
    }
    public void turnLeft() {
        System.out.println(name + " turned left");
    }
    public void turnRight() {
        System.out.println(name + " turned right");
    }
    public String toString() {
        return "Hand information: Human part: " + name + "; Number of fingers: " +
                + numOfFingers;
    }
}
