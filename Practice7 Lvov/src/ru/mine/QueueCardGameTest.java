package ru.mine;

import java.util.*;

public class QueueCardGameTest {

    public static void showCards(Queue<Character> arr) {
        String res = "";
        for ( Character ch : arr) {
            res +=ch;
        }
        for (int i = res.length()-1; i > -1; i--) {
            System.out.print(res.charAt(i) + " ");
        }

    }
    public static String reverseStr(String res) {
        String a = "";
        for (int i = res.length()-1; i > -1; i--) {
            a += res.charAt(i);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую колоду карт: ");
//	String first = scanner.nextLine();
        System.out.println("Введите вторую колоду карт: ");
//	String second = scanner.nextLine();
        System.out.println("-------------------------------");



        String first = "1 3 5 7 9";
        String second = "2 4 6 8 0";


        first = first.replaceAll("\\s+","");
        second = second.replaceAll("\\s+","");
        System.out.println(first);
        System.out.println(second);

        first = reverseStr(first);
        second = reverseStr(second);

        Queue<Character> firstA = new LinkedList<Character>();
        Queue<Character> secondA = new LinkedList<Character>();
        for (int i = 0; i < first.length(); i++) {
            firstA.offer(first.charAt(i));
            secondA.offer(second.charAt(i));
        }

        int count = 1;
        while(count != 107) {

            if (firstA.isEmpty()) {
                System.out.println("Первая колода оказалась пустой => Победил - second player " +
                        "за "+ (count-1) + " ходов");
                break;
            }
            if (secondA.isEmpty()) {
                System.out.println("Вторая колода оказалась пустой => Победил - first player " +
                        "за "+ (count-1) + " ходов");
                break;
            }
            System.out.println(count + "\tРаунд" + "\n" + "-------------------------------");

            Character upFirst = firstA.poll();
            System.out.println("Верхняя карта из первой колоды: " + upFirst);

            Character upSecond = secondA.poll();

            System.out.println("Верхняя карта из второй колоды: " + upSecond);


            if (upFirst == '0') {
                System.out.println("Карта " + upFirst + " больше чем " + upSecond);
                firstA.offer(upFirst);
                firstA.offer(upSecond);

            }
            else if (upSecond == '0') {
                System.out.println("Карта " + upSecond + " больше чем " + upFirst);
                secondA.offer(upSecond);
                secondA.offer(upFirst);
            }
            else {
                if (upFirst > upSecond) {
                    System.out.println("Карта " + upFirst + " больше чем " + upSecond);
                    firstA.offer(upFirst);
                    firstA.offer(upSecond);
                }
                else {
                    System.out.println("Карта " + upSecond + " больше чем " + upFirst);
                    secondA.offer(upSecond);
                    secondA.offer(upFirst);
                }
            }
            System.out.print("Первая колода карт после " + count + " раунда: "); showCards(firstA);
            System.out.println("\n");
            System.out.print("Вторая колода карт после " + count + " раунда: "); showCards(secondA);
            System.out.println("\n");




            count++;
        }
        if (count == 106) {
            System.out.println("Botva");
        }

    }
}
