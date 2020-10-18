package ru.mine;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FileWordOrder {

    public static String getLine(String line) {
        String[] words = line.split(" ");
        ArrayList<String> list = new ArrayList<>();
        //Collections.addAll(list,words);

        list.add(words[0]);
        int i = 0;
        String first = list.get(0);
        while (list.size() != words.length) {
            if (list.contains(words[i])) {
                i++;
            }
            else if (words[i].charAt(0) == first.charAt(first.length()-1)) {
                list.add(words[i]);
                first = words[i];
                i = 0;
            }
            else if (words[i].charAt(words[i].length()-1) == first.charAt(0)) {
                list.add(list.indexOf(first), words[i]);
                first = words[i];
                i =0;
            }
            else {
                i++;
            }

        }
        StringBuilder b = new StringBuilder();
        for (String s : list) {
            b.append(s).append(" ");
        }
        return  b.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        try {
            File file = new File(inp);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            System.out.println(getLine(line));
        }
        catch (FileNotFoundException e) {
            System.out.println("No such file found");
        }
        catch (IOException e) {
            System.out.println("The line is empty");
        }


    }
}
