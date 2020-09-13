package ru.mine;

public class Book extends PriceObj{
private String author;

public Book(String name, int price, String author){
  super(name,price);
  this.author = author;
}

  @Override
  public String toString() {
    return "Book{" + "name='" +  getName() +
            "' author='" + author  + "' price='" + getPrice() +
            "'}";
  }
}
