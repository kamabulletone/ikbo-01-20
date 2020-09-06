package ru.mine;

public class Shepherd extends Dog {
    private String breed = "Siberian Husky";
    private String earForm;




    public Shepherd(String name, int age) {
        super(name,age);
        earForm = "Стоячие уши(естественное положение)";
        furColor = "допустимы большинство цветов, кроме белого";
        height = "в среднем 60 см";




    }

    public String toString() {
        return "Информация о собаке: \nКличка: " + getName() + "; \nВозраст: " + getAge()
                + "; \nЦвет шерсти: " + getFurColor() + "; \nСредний рост: " + getHeight() + "\nОсобенности: " + earForm +
                ", " + getBreed();
    }

    public String getBreed() {
        return "Овчарка";
    }
}
