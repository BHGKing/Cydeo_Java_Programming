package day12_Custom_Methods_Intro;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(10.5, 20.5);

        System.out.println("---------------------------------------");

        maxNum(15000, 16000);

        System.out.println("-------------------------------------");

        maxNum( -200, -20);


        System.out.println("-------------------------------------");

        initial("Cydeo", "School");


        System.out.println("-------------------------------------");

        initial("Mohammad", "Karim"); //M.K

        System.out.println("-------------------------------------");

        initial("Hasan", "Ayhan"); //H.A

        System.out.println("------------------------------------");

        initial("Java", "Programming"); //J.P




    }

    public static void maxNum(double num1, double num2){

        if (num1 > num2){
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1){
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }
    }

    public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("Initial is: " + initial);


    }

}
