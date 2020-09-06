package ru.mine;

public class Main {

    public static void main(String[] args) {
	Human sam = new Human("Sam", "white", 20);
	Head head = new Head("Head", "round", "white");
	Hand rightHand = new Hand("RightHand", 5);
	Hand leftHand = new Hand("LeftHand", 5);
	Leg rightLeg = new Leg("RightLeg", 77);
	Leg leftLeg = new Leg("LeftLeg", 77);


        System.out.println(sam.toString());
        System.out.println(head.toString());

        System.out.println(rightHand.toString());
        System.out.println(leftHand.toString());

        System.out.println(rightLeg.toString());
        System.out.println(leftLeg.toString());

    }
}
