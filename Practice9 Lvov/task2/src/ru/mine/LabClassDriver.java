package ru.mine;

import java.util.*;

public class LabClassDriver implements LabClassUI{

    private ArrayList<Student> arr;

    @Override
    public Student findStudent(String firstName, String lastName, String secondName) throws StudentNotFoundException {
        for (Student st : arr) {
            if (st.getFirstName().equals(firstName) &&
                st.getLastName().equals(lastName) &&
                st.getSecondName().equals(secondName)) {

                return st;
            }

        }
        throw new StudentNotFoundException("No Student found");
    }

    @Override
    public void addStudents(List<Student> list) {
        arr.addAll(list);
    }

    public LabClassDriver() {
        arr = new ArrayList<>();
    }

    public void addStudent(Student student) throws EmptyStringException {
        arr.add(student);
    }

    @Override
    public void sortByLastName() {
        arr.sort(Comparator.comparing(Student::getLastName));
    }

    @Override
    public void sortByMark() {
        Collections.sort(arr);
    }
    public List<Student> getStudents() {
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("--------------Students---------------\n");

        for (Student st : arr) {
            str.append(st.getFirstName()).append(" ").append(st.getSecondName()).append(" ").append(st.getLastName()).append(" ").append(st.getGrade()).append("\n");
        }

        return str.toString();
    }
}
