package ru.mine;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try() {
//
//
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        try() {
//
//
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        //FileReader reader = new FileReader("src/file/text.txt");
        Scanner scan = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("D:\\JAVA UNIVERSITY\\ikbo-01-20\\lab8test.txt", false);
            String s = scan.nextLine();
            while (!s.equals("exit")) {
                writer.write(s);
                writer.append("\n");
                s = scan.nextLine();

            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }





    }
}
