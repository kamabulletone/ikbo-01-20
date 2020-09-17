package ru.mine;

import java.util.Scanner;

public class N17 {

    public static int maxRec(int max, Scanner scanner) {
        int k = scanner.nextInt();
        if (k == 0) {
            return max;
        } else {
            if (max < k) {
                max = k;

            }
            max = maxRec(max, scanner);

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int max = 0;
        int res = maxRec(max,scanner);
        System.out.println("The maximum number: " + res);
    }
}
