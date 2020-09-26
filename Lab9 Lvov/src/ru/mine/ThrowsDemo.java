package ru.mine;

public class ThrowsDemo {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        }
        catch (NullPointerException e) {
            return "no data found";
        }


    }

    public static void main(String[] args) {
        ThrowsDemo a = new ThrowsDemo();
        a.printMessage(null);


    }



}
