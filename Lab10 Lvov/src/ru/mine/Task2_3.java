package ru.mine;

import java.util.Arrays;

public class Task2_3<E> {

    E[] arr;
    public Task2_3(E[] a) {
       arr = a.clone();
    }
    public E getElement(int index) {
        return arr[index];
    }
    public E[] getArr() {
        return arr;
    }



    public static void main(String[] args) {
        Integer[] b = {1,2,3,4};
        String[] b3 = {"sos", "yeap", "bruh"};
        Task2_3<Integer> a1 = new Task2_3<>(b);
        Task2_3<String> a2 = new Task2_3<>(b3);
        System.out.println(Arrays.toString(a1.getArr()));
        System.out.println(Arrays.toString(a2.getArr()));
        System.out.println("---------------------------------");
        System.out.println(a1.getElement(1));
        System.out.println(a2.getElement(2));
    }

}
