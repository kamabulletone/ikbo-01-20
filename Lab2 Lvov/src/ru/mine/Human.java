package ru.mine;

public class Human {
    private String skinColor;
    private int age;
    private String name;

    public Human(String name, String skinColor) {
        this.name=name;
        this.skinColor = skinColor;
    }

    public Human(String name, String skinColor, int age) {
        this.age = age;
        this.name=name;
        this.skinColor = skinColor;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSkinColor() {
        return skinColor;
    }
    public void setSkinColor() {
        this.skinColor = skinColor;
    }

}
