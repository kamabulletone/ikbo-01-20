package ru.mine;

import java.util.Arrays;

public class InsertionSort {

    public static Comparable[] InsertionSort(Comparable[] array) {
        for (int left = 0; left < array.length; left++) {
            Comparable temp;
            // Вытаскиваем значение элемента
             temp = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (temp.compareTo(array[i]) == 1) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
//        int[] array = {10, 2, 10, 3, 1, 2, 5};
        Comparable[] arr = new Student[3];
        Student st1 = new Student(523,2);
        Student st2 = new Student(323,5);
        Student st3 = new Student(400,3);
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;
        arr  = InsertionSort(arr);
        //System.out.println(Arrays.toString(res));\
        for (int i =0; i < arr.length; i++) {
            System.out.println(((Student)arr[i]).getiDNumber());
        }

        //System.out.println(Arrays.toString(array));
    }
}
