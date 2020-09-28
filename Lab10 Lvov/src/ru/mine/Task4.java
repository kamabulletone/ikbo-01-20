package ru.mine;

import java.io.*;
import java.util.ArrayList;

public class Task4 {

    ArrayList<File> list;

    public Task4(String dirPath)  {
        list = new ArrayList<File>();


        try {
            File f = new File(dirPath);
            File[] listOfFiles = f.listFiles();
            for (File listOfFile : listOfFiles) {
                list.add(listOfFile);
               // System.out.println(listOfFile.getName());
            }
        }
        catch (Exception e) {
            System.out.println("eroror");
        }

    }

    public void writeFile(String dirFile) throws IOException {
        FileWriter writer = new FileWriter(dirFile);

        for (File f : list) {
            writer.write(f.getName() + System.getProperty("line.separator"));

        }
        writer.close();
    }
    public void readFile(String dirFile, int count) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(dirFile));
        for (int i = 0; i < count; i++) {
            System.out.println(reader.readLine());
        }
        reader.close();
    }

    public ArrayList<File> getList() {
        return list;
    }
    public File getFile(int index) {
        return list.get(index);
    }


    public static void main(String[] args) {
        String dirPath = "D:\\JAVA UNIVERSITY\\ikbo-01-20"; // указать путь к читаемому каталогу
        String filePath = "..\\result.txt"; // путь к файлу в который запишеться результат

        Task4 a = new Task4(dirPath);
        try {
            a.writeFile(filePath);
            a.readFile(filePath, 5);
        }
        catch(IOException e) {
            System.out.println("Error");
        }



    }
}
