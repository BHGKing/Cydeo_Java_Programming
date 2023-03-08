package day13_Custom_Methods_Continue;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(25);
        System.out.println("----------------------------------");

        System.out.println("Test1 Started");

        boolean exit = true;

        if(exit){
            return; // main method gets terminated
        }

        System.out.println("Test1 Completed");

        System.out.println("Test2 Started");



    }

    public static void eligible (int age){

        if (age < 0 || age > 150){

            System.err.println("Invalid Age: "+age);
            return; // exits the current method (eligible)

        }

        if (age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }

    }





}
