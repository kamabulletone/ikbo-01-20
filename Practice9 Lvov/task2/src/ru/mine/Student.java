package ru.mine;

public class Student implements Comparable<Student> {
    private String firstName;
    private String secondName;
    private String lastName;
    private int iDNumber;
    private Integer grade;

    public Student(int iDNumber, Integer grade, String firstName, String lastName, String secondName) throws EmptyStringException {
        if (firstName.isEmpty() || lastName.isEmpty() || secondName.isEmpty()) {
            throw new EmptyStringException("Some input is empty");
        }
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.getGrade());
      //  return this.iDNumber - o.getiDNumber();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iDNumber=" + iDNumber +
                ", grade=" + grade +
                '}';
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
