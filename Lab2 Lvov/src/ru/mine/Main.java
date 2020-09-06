package ru.mine;

public class Main {

    public static void main(String[] args) {
	Human sam = new Human("Sam", "white", 20);
	Head head = new Head("Head", "white", "round", "black");
	Hand rightHand = new Hand("RightHand", "white", 5);
	Hand leftHand = new Hand("LeftHand", "white", 5);
	Leg rightLeg = new Leg("RightLeg", "white", 77);
	Leg leftLeg = new Leg("LeftLeg", "white", 77);


        System.out.println(sam.toString());
        System.out.println(head.toString());

        System.out.println(rightHand.toString());
        System.out.println(leftHand.toString());

        System.out.println(rightLeg.toString());
        System.out.println(leftLeg.toString());

    }
}
