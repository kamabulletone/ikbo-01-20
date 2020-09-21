package ru.mine;

import java.util.Scanner;

public class N15 {

	public static void numFlip(int num) {
		if (num == 0) return;
		else {
			int rem = num % 10;
			num /= 10;
			System.out.print(rem);
			numFlip(num);

		}

	}

    public static void main(String[] args) {
	int num;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your num: ");
	num = scanner.nextInt();
	numFlip(num);

    }
}
