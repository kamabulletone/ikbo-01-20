package ru.mine;

import java.util.Comparator;

/*public class Sort {
    public static  void quickSort(Comparable<Student>[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Comparable<Student> opora = array[middle];


        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo((Student) opora) < 0) {
                i++;
            }

            while (array[j].compareTo((Student) opora) > 0) {
                j--;
            }



            if (i <= j) {//меняем местами
                Comparable<Student> temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Student[] arr = new Student[5];
        Student st1 = new Student(523,2,"bapa");
        Student st2 = new Student(323,3,"aama");
        Student st3 = new Student(900,5, "cede");
        Student st4 = new Student(1,4, "pogaaa");
        Student st5 = new Student(5,5, "egfff");
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;
        arr[3] = st4;
        arr[4] = st5;
        quickSort(arr,0,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getiDNumber() + " " +  arr[i].getGrade() + " " + arr[i].getName());
        }
    }
}*/
