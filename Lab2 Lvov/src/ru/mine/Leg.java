package ru.mine;

public class Leg extends Human{
    private int legLength;

    public Leg(String name, String skinColor, int legLength) {
        super(name,skinColor);
        this.legLength = legLength;
    }

    public void moveUp() {
        System.out.println(name + "moved up");
    }
    public void bendKnees() {
        System.out.println(name + "bend it's knee");
    }
}
