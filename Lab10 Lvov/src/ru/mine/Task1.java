package ru.mine;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

    public static <E> ArrayList<E> arrToList(E[] arr) {
        ArrayList<E> list = new ArrayList<E>();
        Collections.addAll(list, arr);
        return list;
    }

    public static void main(String[] args) {
        String[] arr1 = {"1", "sd", "of"};
        Integer[] arr2 = {1 , 2, 3};
        ArrayList<String> r1 = arrToList(arr1);
       ArrayList<Integer> r2 =  arrToList(arr2);
        System.out.println(r1);
        System.out.println(r2);

    }
}
