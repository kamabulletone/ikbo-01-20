package ru.mine;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1.getClass());
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //Все выводы выше пользуются версией класса Circle,т.к. данные методы были объявлены в
        //Shape и затем переопределены в Circle

        //System.out.println(s1.getRadius());

        //Данный метод не сработал, т.к. доступные члены класса определяются типом ссылочной
        //переменной s1 ( Shape ), а не типом объекта (Circle) => невозможно получить доступ к членам класса
        //объявленным в Circle(radius, getRadius)

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // невозможно создать объект абстрактного класса по определению

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //Причину смотреть на строчке 18-20


        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //Причину смотреть на строчке 18-20

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //Причину смотреть на строчке 18-20
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        MovableRectangle rect;
        rect = new MovableRectangle(5,10,-5,10,3,3);
        if (rect.speedIsEqual()) {
            System.out.println(rect);
            rect.moveRight();
            rect.moveDown();
            System.out.println(rect);
        }
        else System.out.println("Скорости не равны => прямоугольник сломается\n");

        MovableCircle cir = new MovableCircle(10,15,-2,5,8);
        System.out.println(cir);
        cir.moveLeft();
        cir.moveUp();
        System.out.println(cir);

        MovablePoint p = new MovablePoint(0,5,4,0);
        System.out.println(p);
        p.moveDown();
        p.moveRight();
        System.out.println(p);





    }
}
