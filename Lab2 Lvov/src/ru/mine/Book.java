package ru.mine;

public class Book {
String name;
String author;
String datePublish;
int cost;

public Book(String name, String author, String datePublish, int cost) {
  this.name = name;
  this.cost = cost;
  this.datePublish = datePublish;
  this.author = author;
}

public void setName(String name) {
  this.name = name;
}

public void setAuthor(String author) {
  this.author = author;
}

public void setDatePublish(String datePublish) {
  this.datePublish = datePublish;
}
public void setCost(int cost) {
  this.cost = cost;
}

public String getName() {
  return name;
}
public String getAuthor() {
  return author;
}
public String getDatePublish() {
  return datePublish;
}
public int getCost() {
  return cost;
}
public String toString() {
  return "Book: Book name: " + name + " Author: " + author + " Publish date " + datePublish + " Book cost: " + cost + "rub";
}

}
