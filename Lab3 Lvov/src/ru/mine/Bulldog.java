package ru.mine;

public class Bulldog extends Dog {
    private String breed = "Bulldog";
    private String neckThickness;
    private String foldQuantity;



    public Bulldog(String name, int age) {
        super(name,age);
        neckThickness = "Толстая шея";
        foldQuantity = "Большое количество складок";
        furColor = "тигровый,пестрый, однотонный рыжий";
        height = "в среднем 38 см";

    }

    public String toString() {
        return "Информация о собаке: Кличка: " + getName() + "; Возраст: " + getAge()
                + "; Цвет шерсти: " + getFurColor() + "; Средний рост: " + getHeight() + "\n Особенности: " + neckThickness +
                " " + foldQuantity + getBreed();
    }

    public String getBreed() {
        return "Bulldog";
    }


}
