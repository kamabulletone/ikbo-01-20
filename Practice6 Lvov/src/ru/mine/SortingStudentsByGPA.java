package ru.mine;

import java.util.Comparator;

public class SortingStudentsByGPA  implements Comparator<Student>  {


    public int compare(Student s1, Student s2) {
        return s1.getGrade() - (s2.getGrade());
    }

}
