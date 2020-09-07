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
        return "Информация о собаке: \nКличка: " + getName() + "; \nВозраст: " + getAge()
                + "; \nЦвет шерсти: " + getFurColor() + "; \nСредний рост: " + getHeight() + "\nОсобенности: " + earForm +
                ", " + getBreed();
    }

    public String getBreed() {
        return "Сибирский хаски";
    }
}
