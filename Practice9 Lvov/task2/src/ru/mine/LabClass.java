package ru.mine;

public class LabClass {
    LabClassUI classUI;
    public LabClass () {
        this.classUI = new LabClassDriver();
    }

    public LabClassUI getClassUI() {
        return classUI;
    }

    @Override
    public String toString() {
        return classUI.toString();
    }
}
