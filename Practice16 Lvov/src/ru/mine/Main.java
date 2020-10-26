package ru.mine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws AlreadyAddedOrderException {
//        Item drink1 = new Drink(250, "Молочные коктейли", "Ванильный / Банановый / Ягодный");
//        Item drink2 = new Drink(300, "Холодный кофе", "Цитрусовый / Пряный / Классический");
//        Item dish1 = new Dish(420, "Буррито", "Кесадилья с говяжьей вырезкой, сыром чеддер, грибами с соусом томатная сальса в сырной тортилье");
//        Item dish2 = new Dish(529, "Пицца Гавайская", "Томатный соус, сыр, курица, ананасы");
//
//        Order ord1 = new RestaurantOrder();
//        ord1.add(dish1);
//        ord1.add(drink2);
//        System.out.println("Order1: " + Arrays.toString(ord1.getOrders()));
//
//        Order ord2 = new InternetOrder();
//        ord2.add(drink1);
//        ord2.add(dish2);
//        System.out.println("Order2: " + Arrays.toString(ord2.getOrders()));
//
//        System.out.println("Order2: " + ord2.costTotal());
//
//        System.out.println("Order2: " + Arrays.toString(ord2.dishesNames()));
//
//        System.out.println("Order2: " + Arrays.toString(ord2.sortedDishesByCostDesc()));

//        Order ord4 = new InternetOrder();
//        Item d = new Dish(0,"sd","sds");
//        ord4.add("fdf",d);
//        ord4.add("fdf",d);
//        System.out.println("Order4: " + Arrays.toString(ord4.getOrders()));

//        Order ord3 = new RestaurantOrder();
//        ord3.add(new Dish(-1,"sd","sds"));
//        System.out.println("Order3: " + Arrays.toString(ord3.getOrders()));

        Item dish01 = new Dish(1500.30, "Lasagne", "Type of wide, flat pasta");
        Item dish02 = new Dish(2050.20, "Veal Orloff", "Dish of Russian cuisine");
        Item drink01 = new Drink(50.5, "Peach juice", "Tasty juice");
        Item drink02 = new Drink(100.60, "Black coffee", "Very bitter, dark coffee");

        Order order01 = new RestaurantOrder();
        order01.add(dish01);
        order01.add(drink01);
        System.out.println("order01:");
        System.out.println(Arrays.toString(order01.sortedDishesByCostDesc()));

        Order order02 = new InternetOrder();
        order02.add(dish02);
        order02.add(drink02);
        System.out.println("order02:");
        System.out.println(Arrays.toString(order02.sortedDishesByCostDesc()));

        InternetOrder order03 = new InternetOrder();
        order03.add("SPB", order02);
        order03.add("SPB", drink01);
        System.out.println("order03:");
        order03.getOrders();

        System.out.println(Arrays.toString(order01.sortedDishesByCostDesc()));

        order01.add(dish02);
        System.out.println("add item to order01:");
        System.out.println(Arrays.toString(order01.dishesNames()));
        System.out.println("Num of orders in order01: " + order01.dishQuantity());
        System.out.println("Total sum in order01: " + order01.costTotal());
        order01.remove("Lasagne");
        System.out.println(Arrays.toString(order01.dishesNames()));
        order01.add(drink01);
        order01.add(drink01);
        // add more drink01 to test deleting operation
        System.out.println(Arrays.toString(order01.dishesNames()));
        System.out.println("deleted: " + order01.removeAll("Peach juice"));
        System.out.println(Arrays.toString(order01.dishesNames()));

    }
}
