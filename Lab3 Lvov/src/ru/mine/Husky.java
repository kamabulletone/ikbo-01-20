package ru.mine;

public class Husky extends Dog {
    private String breed = "Siberian Husky";
    private String earForm;




    public Husky(String name, int age) {
        super(name,age);
        earForm = "Стоячие уши(естественное положение)";
        furColor = "все цвета от черного до белоснежного";
        height = "в среднем 55 см";



    }

    public String toString() {
        return "Информация о собаке: Кличка: " + getName() + "; Возраст: " + getAge()
                + "; Цвет шерсти: " + getFurColor() + "; Средний рост: " + getHeight() + "\n Особенности: " + earForm +
                getBreed();
    }

    public String getBreed() {
        return "Bulldog";
    }
}
