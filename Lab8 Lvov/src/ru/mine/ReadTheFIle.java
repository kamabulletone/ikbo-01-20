package ru.mine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheFIle  {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("..\\lab8test.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
