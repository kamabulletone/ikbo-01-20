package ru.mine;

public class Task2 {
    public static void main(String[] args) {
        ChairFactory fac = new ChairFactory();
        Client client = new Client();
        System.out.println("Types of Chairs: ");
        System.out.println("1. " + fac.createVictorianChair());
        System.out.println("2. " + fac.createMagicChair());
        System.out.println("3. " + fac.createFunctionalChair());
        System.out.println("--------------------------------");
        System.out.println("Clients actions: ");
        client.setChair(fac.createFunctionalChair());
        client.sit();
        client.setChair(fac.createMagicChair());
        client.sit();
        client.setChair(fac.createVictorianChair());
        client.sit();

    }
}
