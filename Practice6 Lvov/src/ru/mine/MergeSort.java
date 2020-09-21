package ru.mine;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeSort {


    public static Comparable[] sortArray(Comparable[] arrayA, Comparator comp){ // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        Comparable [] arrayB = new Comparable[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        Comparable [] arrayC = new Comparable[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB, comp); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC, comp); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC, comp);
    }

    public static Comparable[] mergeArray(Comparable[] arrayА, Comparable[] arrayB, Comparator comp) {

        Comparable[] arrayC = new Comparable[arrayА.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayА.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayА[positionA];
                positionA++;
            } else if (comp.compare(arrayА[positionA],arrayB[positionB] ) < 0) {
                arrayC[i] = arrayА[i - positionA];
                positionA++;
            }
//            else if (comp.compare(arrayА[positionA],arrayB[positionB] ) == 0) {
//                arrayC[i] = arrayА[positionA];
//                positionA++;
//                positionB++;
//            }
            else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }



    public static void main(String[] args) {
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student[] arr1 = new Student[6];

        Student st1 = new Student(523,2);
        Student st2 = new Student(323,3);
        Student st3 = new Student(400,5);
        

        //Student[] arr2 = new Student[3];
        Student st4 = new Student(601,1);
        Student st5 = new Student(599,4);
        Student st6 = new Student(901,4);
        arr1[0] = st1;
        arr1[1] = st2;
        arr1[2] = st3;
        arr1[3] = st4;
        arr1[4] = st5;
        arr1[5] = st6;
        Comparable[] res = sortArray(arr1,comp);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Student's iD: " + ((Student)res[i]).getiDNumber() + " Mark: " + ((Student)res[i]).getGrade());
        }
        //arr2 = sortArray(arr2, comp);
//        Comparable[] res = mergeArray(arr1,arr2, comp);
//        for (Comparable a: res
//             ) {
//            System.out.println( ((Comparable)a).getGrade());
//
//        }

    }
}
