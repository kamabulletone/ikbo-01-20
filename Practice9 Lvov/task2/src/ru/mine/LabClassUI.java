package ru.mine;

import java.util.List;

public interface LabClassUI  {

    public void sortByMark();
    public void sortByLastName();
    public void addStudent(Student st) throws EmptyStringException;
    public List<Student> getStudents();
    public void addStudents(List<Student> list);


    public Student findStudent(String name, String lastName, String secondName) throws StudentNotFoundException;


}
