package ru.mine;

import java.util.Arrays;

public class Main {

    public int Fac(int n) {
        int sum =1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
	//Практика 1 задание 3: Вывести первые 10 чисел гармонического ряда
        // каждый элемент гармонического ряда записывается как 1/k где k = 1,2,3..inf
        int sum =0;
        System.out.println("Гармонический ряд: ");
        for(int i = 1; i < 11; i++) {

            System.out.print(String.valueOf((float)1/i) + " ");
        }
        int[] arr = {5,2,3,4,6};
        System.out.println("Сумма чисел массива: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("Вывод аргументов командной строки");

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        System.out.println("Создан и отсортирован массив из случайных чисел\n");
        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] +" ");
        Main a = new Main();
        System.out.println("\n" + a.Fac(5));



    }
}
