package ru.mine;

public class TestPrice {

  public static void main(String[] args) {
  Book book = new Book("The black Tower", 1200, "Stephen King");
  ToyCar car = new ToyCar("BMW", 2000, "Green");
  System.out.println(book.getPrice());
    System.out.println(book);
    System.out.println(car);
  
   
  }
}
