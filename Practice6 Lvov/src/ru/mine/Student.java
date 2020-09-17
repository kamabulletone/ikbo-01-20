package ru.mine;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private int grade;

    public Student(int iDNumber, int grade) {
        this.iDNumber = iDNumber;
        this.grade = grade;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getGrade() {
       return grade;
    }

    @Override
    public int compareTo(Student o) {
        return iDNumber - (o.getiDNumber());
    }

    /*@Override
    public int compareTo(Object o) {
        if (this.iDNumber < ((Student) o).getiDNumber()) {
            return 1;
        }
        else  {
            return 0;
        }

    }*/
}
