package ru.mine;

public final class Dish implements Item{
    private final double cost;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        if (name==null || description==null) {
            throw new IllegalArgumentException("Wrong input");
        }
        this.cost = 0d;
        this.name = name;
        this.description = description;

    }

    public Dish(double cost,String name, String description) {
        if (cost < 0 ||name==null || description==null) {
            throw new IllegalArgumentException("Wrong input");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
