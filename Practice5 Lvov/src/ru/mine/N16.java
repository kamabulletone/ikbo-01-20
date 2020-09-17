package ru.mine;

import java.util.Scanner;

public class N16 {

    public static int maxQuan(int max, int quan) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 0) {
            return quan;
        } else {
            if (max < k) {
               quan =  maxQuan(k, 1);

            }
            else if (k == max) {
                quan = maxQuan(max, ++quan);
            }
            else quan = maxQuan(max,quan);
            /*if (k == Math.max(k, maxQuan(quan))) {
                quan++;
            }
            else {
                quan = 0;
            }
            return quan;*/
        }
        return quan;


    }

    public static void main(String[] args) {
        int max = 0;
        int quan = 0;
        Scanner scanner = new Scanner(System.in);
        int res = maxQuan(max, quan);
        System.out.println("Max quantity: " + res);

    }
}
