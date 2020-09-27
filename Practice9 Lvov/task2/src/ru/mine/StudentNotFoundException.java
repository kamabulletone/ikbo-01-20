package ru.mine;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String no_student_found) {
        super("Student not found");
    }
}
