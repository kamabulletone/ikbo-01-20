package ru.mine;

import java.util.Scanner;

public class ThrowsDemo6 {

    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        while (true) {
            String key = myScanner.next();
            try {
                printDetails( key );
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong input. Enter again");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("00")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowsDemo6 a = new ThrowsDemo6();
        a.getKey();
    }
}
