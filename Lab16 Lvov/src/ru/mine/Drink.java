package ru.mine;

 public final class Drink extends MenuItem implements Alcoholable {
     double alcoholVol;
     DrinkTypeEnum type;

     public Drink(double alcoholVol,DrinkTypeEnum type){
         this.alcoholVol = alcoholVol;
         this.type = type;
     }

     public DrinkTypeEnum getType() {
         return type;
     }

     @Override
     public boolean isAlcoholicDrink() {
         return type.isAlcohol();
     }

     @Override
     public double getAlcoholVol() {
         return alcoholVol;
     }
     /*    private final double cost;
     private final String name;
     private final String description;

     public Drink(String name, String description) {
         if (name==null || description==null) {
             throw new IllegalArgumentException("Wrong input");
         }
         this.cost = 0d;
         this.name = name;
         this.description = description;
     }

     public Drink(double cost,String name, String description) {
         if (cost < 0 || name==null || description==null) {
             throw new IllegalArgumentException("Wrong input");
         }
         this.cost = cost;
         this.name = name;
         this.description = description;
     }

     public String getName() {
         return name;
     }

     public double getCost() {
         return cost;
     }

     public String getDescription() {
         return description;
     }

     @Override
     public String toString() {
         return "Drink{" +
                 "cost=" + cost +
                 ", name='" + name + '\'' +
                 ", description='" + description + '\'' +
                 '}';
     }*/
 }
