package ru.mine;

public class TestAuthor {

    public static void main(String[] args) {
	Author am = new Author("Ivan Popov","IvPopov@yandex.ru", 'M');
	Author af = new Author("Marina Popova","MaPopova@yandex.ru", 'F');
	Author au = new Author("Alex Manulov","Aman@yandex.ru", 'U');

        System.out.println(am.toString());
        System.out.println(af.toString());
        System.out.println(au.toString() + "\n");

        System.out.println("Name list: " + am.getName() + " " + af.getName() + " " + au.getName());
        System.out.println("Email list: \n" + am.getEmail() + "\n" + af.getEmail() + "\n" + au.getEmail() );

    }
}
