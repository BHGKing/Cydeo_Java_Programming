package day12_Custom_Methods_Intro;

public class CustomMethodIntro {

    public static void main(String[] args) {

        System.out.println("Test Started");

        greetings();

        System.out.println("Test Completed");

        System.out.println("-----------------------------------");

        displayMessage();


    }

    public static void greetings(){

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");

    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Java");
    }



}