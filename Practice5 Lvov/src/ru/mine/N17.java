package ru.mine;

import java.util.Scanner;

public class N17 {

    public static int maxRec() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 0) {
            return 0;
        } else {
            /*if (max < k) {
                max = k;

            }
            max = maxRec(max, scanner);*/
            return Math.max(k,maxRec());

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int max = 0;
        int res = maxRec();
        System.out.println("The maximum number: " + res);
    }
}
