package ru.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI classUI = new LabClass().getClassUI();
        List<Student> arr = new ArrayList<>();
        arr.add(new Student(502,4,"Роман","Скоробогатько","Петрович"));
        arr.add(new Student(402,5,"Август","Бан","Данилович"));
        arr.add(new Student(602,3,"Никита","Жан","Петрович"));
        arr.add(new Student(602,3,"Иван","Джар","Арсеньевич"));

        classUI.addStudents(arr);
        System.out.println(classUI);


        classUI.sortByLastName();
        System.out.println("Sorted by LastName");
        System.out.println(classUI);

        classUI.sortByMark();
        System.out.println("Sorted by Mark");
        System.out.println(classUI);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name of a student: ");
        System.out.println(classUI.findStudent(scan.next(), scan.next(), scan.next()));
    }


}
