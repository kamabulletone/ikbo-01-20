package ru.mine;

public abstract class PriceObj implements Priceable {
private String name;
private int price;

public PriceObj(String name, int price) {
  this.name = name;
  this.price = price;
}

public int getPrice() {
  return price;
}
public String getName() { return name;}

}
