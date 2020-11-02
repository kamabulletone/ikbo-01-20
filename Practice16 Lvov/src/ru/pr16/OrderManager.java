package ru.mine;

import java.util.Arrays;
import java.util.Comparator;

public class OrderManager implements Order {
    private CircularLinkedList<Item> orders;

    public OrderManager() {
        this.orders = new CircularLinkedList<>();
    }

    @Override
    public boolean add(Item item) {
        return orders.add(item);
    }

    @Override
    public boolean remove(String mealName) {
        long count = Arrays.stream(orders.toArray()).filter(i -> i.getName().equals(mealName)).
                count();
        Item item = Arrays.stream(orders.toArray()).filter(i -> i.getName().equals(mealName)).
                skip(count - 1).findFirst().orElse(null);
        //findFirst().orElse(null);
        if (item == null) {
            return false;
        }
        return orders.remove(item);
    }

    @Override
    public int removeAll(String mealName) {
        return (int) Arrays.stream(orders.toArray()).
                filter(i -> i.getName().equals(mealName)).
                map(el -> orders.remove(el)).count();
    }

    @Override
    public int dishQuantity() {
        return orders.getSize();
    }

    @Override
    public Object[] getOrders() {
        return orders.toArray();
    }

    @Override
    public double costTotal() {
        double sum = 0;
        Item[] arr = (Item[]) orders.toArray();
        for (int i = 0;i < arr.length; i++) {
            sum += arr[i].getCost();
        }
        return sum;
    }

    @Override
    public Object[] dishesNames() {
        return  Arrays.stream(orders.toArray()).map(Item::getName).toArray();
    }
    @Override
    public Object[] sortedDishesByCostDesc() {
        Item[] arr = orders.toArray();
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o2.getCost() - o1.getCost());
            }
        });

        return arr;
    }

}
