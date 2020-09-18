package ru.mine;

import java.util.ArrayDeque;
import java.util.Scanner;

public class CardGameTest {


    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//	String first = scanner.nextLine();
//	String second = scanner.nextLine();


		String first = "1 3 5 7 9";
		String second = "2 4 6 8 0";


	first = first.replaceAll("\\s+","");
	second = second.replaceAll("\\s+","");
        System.out.println(first);
        System.out.println(second);

		ArrayDeque<Character> firstA = new ArrayDeque<Character>();
		ArrayDeque<Character> secondA = new ArrayDeque<Character>();
		for (int i = 0; i < first.length(); i++) {
			firstA.addFirst(first.charAt(i));
			secondA.addFirst(second.charAt(i));
		}

		int count = 0;
		while(count != 106) {
			if (firstA.isEmpty()) {
				System.out.println("second " + count);
				break;
			}
			if (secondA.isEmpty()) {
				System.out.println("first" + count);
				break;
			}
			Character upFirst = firstA.poll();
			Character upSecond = secondA.poll();
			if (upFirst == '0') {
				firstA.addLast(upFirst);
				firstA.addLast(upSecond);
			}
			else if (upSecond == '0') {
				secondA.addLast(upSecond);
				secondA.addLast(upFirst);
			}
			else {
				if (upFirst > upSecond) {
					firstA.addLast(upFirst);
					firstA.addLast(upSecond);
				}
				else {
					secondA.addLast(upSecond);
					secondA.addLast(upFirst);
				}
			}




			count++;
		}
		if (count == 106) {
			System.out.println("Botva");
		}

    }



}
