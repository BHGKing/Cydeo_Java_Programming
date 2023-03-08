package day13_Custom_Methods_Continue;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println( isOdd(100)  );

        int num = 200;

        if(isEven(num)){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }

        System.out.println("-------------------------------");




    }

    public static boolean isOdd(int num){

        // return (num % 2 != 0) ? true : false; // also possible
        if(num % 2 != 0){
            return true;
        }else {
            return false;
        }
        // return false; // also possible
    }

    public static boolean isEven(int num){

        return !isOdd(num);
        // return (num % 2 == 0) ? true : false;  // also possible

    }

    public static int max(int n1, int n2){

        return n1 > n2 ? n1 : n2;

/*
        if (n1 > n2){
            return n1;
        }else {
            return n2;
        }
*/

    }




}
