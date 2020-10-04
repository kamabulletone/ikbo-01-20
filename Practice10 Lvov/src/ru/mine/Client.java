package ru.mine;

public class Client implements Chair {
    public Chair chair;

    public void sit() {
        System.out.println("You have just sat on" + chair );
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
