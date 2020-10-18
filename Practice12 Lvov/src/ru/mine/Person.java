package ru.mine;

import java.sql.SQLOutput;

public class Person {
    String name;
    String lastName;
    String secondName;

    public Person(String lastName, String name, String secondName) {
        try {

            this.name = (name == null) ? "" : name;
            this.secondName = (secondName == null) ? "" : secondName;
            if (lastName == null) {
                throw new EmptyStringException();
            }
            else this.lastName = lastName;

        }
        catch (EmptyStringException e) {
            System.out.println("Last name cannot be empty");
        }

    }

    public String getFullName() {
        return "Person's fullname: " + lastName + " " + name + " " + secondName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Михайлов","Антон","Владиславович");
        Person p2 = new Person("Ладыгин",null,null);
        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
    }
}
