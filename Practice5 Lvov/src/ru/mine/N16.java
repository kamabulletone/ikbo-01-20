package ru.mine;

import java.util.Scanner;

public class N16 {

    public static int maxQuan(int max, int quan, Scanner scanner) {
        int k = scanner.nextInt();
        if (k == 0) {
            return quan;
        } else {
            if (max < k) {
                max = k;
                quan++;

            }
            quan = maxQuan(max,quan, scanner);

        }
        return quan;


    }

    public static void main(String[] args) {
        int max = 0;
        int quan = 0;
        Scanner scanner = new Scanner(System.in);
        int res = maxQuan(max,quan,scanner);
        System.out.println("Max quantity: " + res);

    }
}
