package ru.mine;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class QuickSort {

    public static void quickSort(Comparable[] array, int low, int high, Comparator comp) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Comparable opora = array[middle];


        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(array[i],opora) < 0) {
                i++;
            }

            while (comp.compare(array[j], opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j, comp);

        if (high > i)
            quickSort(array, i, high, comp);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student[] arr = new Student[3];
        Student st1 = new Student(523,2);
        Student st2 = new Student(323,3);
        Student st3 = new Student(400,5);
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;
        quickSort(arr,0,2, comp);
        for (int i = arr.length-1; i > -1; i--) {
            System.out.println(arr[i].getiDNumber() + " " +  arr[i].getGrade());
        }
    }
}
