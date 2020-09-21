package ru.mine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheFIle  {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\JAVA UNIVERSITY\\ikbo-01-20\\lab8test.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
