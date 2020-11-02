package ru.mine;

public interface Order {
    boolean add(Item item) ;
    boolean remove(String mealName) ;
    int removeAll(String mealName) ;
    int dishQuantity() ; // возвращает общее число позиций заказа в заказе
   // public int dishQuantity(String meal) ; //возвращает число заказанных блюд или напитков
    Object[] getOrders();
    double costTotal();
    Object[] dishesNames() ;
    Object[] sortedDishesByCostDesc() ;//возвращает массив позиций заказа, отсортированнй по убыванию цены
}

