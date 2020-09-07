package ru.mine;

public class Circle {
private double radius;
private String color;

public Circle(String color, double radius) {
  this.color = color;
  this.radius = radius;
}

public double getRadius() {
  return radius;
}

public void setRadius(double radius) {
  this.radius = radius;
}

public void setColor(String color) {
  this.color= color;
}

public String toString() {
  return "Circle: color: " + color + " radius: " + radius;
}

}
