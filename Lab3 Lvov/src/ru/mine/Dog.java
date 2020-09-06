package ru.mine;

public abstract class Dog {
    private String name;
    private int age;
    protected String height;
    protected String furColor;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getBreed();

    public String getHeight() {
        return height;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();

}


