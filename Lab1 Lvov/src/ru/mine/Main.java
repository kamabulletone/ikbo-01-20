package ru.mine;

public class Main {

    public static void main(String[] args) {
	//Практика 1 задание 3: Вывести первые 10 чисел гармонического ряда
        // каждый элемент гармонического ряда записывается как 1/k где k = 1,2,3..inf
        int sum =0;
        for(int i = 1; i < 11; i++) {

            System.out.println(String.valueOf((float)1/i) + "\n");
        }
    }
}
