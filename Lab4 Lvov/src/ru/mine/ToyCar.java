package ru.mine;

public class ToyCar extends PriceObj {
private String color;


public ToyCar(String name, int price, String color){
  super(name, price);
  this.color = color;
}

  @Override
  public String toString() {
    return "ToyCar{" + " name='" + this.getName() +
            "' color='" + color +
              '\'' +
            " price='" + this.getPrice() + "'}";
  }
}
