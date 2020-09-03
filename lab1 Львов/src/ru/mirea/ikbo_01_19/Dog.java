package ru.mirea.ikbo_01_19;

public class Dog {

    private String furColor;
    private String name;
    private int age;

    public String to_String() {
        return name + " " + furColor + " "+ age;
    }
    public Dog () {
        this.age = 0;
        this.name = "";
        this.furColor = "";
    }
    public Dog (int age, String furColor, String name) {
        this.age = age;
        this.furColor = furColor;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getFurColor() {
        return furColor;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setName(String name) {
        this.name = name;
    }
}
