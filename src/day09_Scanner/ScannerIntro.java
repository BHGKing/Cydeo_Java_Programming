package day09_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // declaring scanner shortcut is to type in Scan

        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte();


        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();


        System.out.println("Enter your third number:");
        int num3 = input.nextInt();

        
        System.out.println("Enter your fourth number:");
        long num4 = input.nextLong();


        input.close();

        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);

        // byte num = input.nextByte();
        //short num = input.nextShort();


    }
}
/*
nextByte()                  Returns input as a byte
nextShort()                 Returns input as a short
nextInt()                   Returns input as an int
nextLong()                  Returns input as a long
nextFloat()                 Returns input as a float
nextDouble()                Returns input as a double
nextBoolean()               Returns input as a boolean
next()                      Returns input as a String, reads the input only until a space
nextLine()                  Returns input as a String, reads the entire input until the new line (press enter)
variableForScanner.close()  Closes the scanner
 */
//test