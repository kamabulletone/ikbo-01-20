package ru.mine;

public class Leg {
    private String name;
    private int legLength;

    public Leg(String name, int legLength) {
        this.name = name;
        this.legLength = legLength;
    }

    public void moveUp() {
        System.out.println(name + "moved up");
    }
    public void bendKnees() {
        System.out.println(name + "bend it's knee");
    }

    public String toString() {
        return "Leg information: Human part: " + name + "; Leg length: " + legLength;
    }
}
