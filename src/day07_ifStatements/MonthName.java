package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int month = 12;

        if (month >= 1 && month <= 12){

                    if (month == 1) System.out.println("January");
                    else if (month == 2) System.out.println("February");
                    else if (month == 3) System.out.println("March");
                    else if (month == 4) System.out.println("April");
                    else if (month == 5) System.out.println("May");
                    else if (month == 6) System.out.println("June");
                    else if (month == 7) System.out.println("July");
                    else if (month == 8) System.out.println("August");
                    else if (month == 9) System.out.println("September");
                    else if (month == 10) System.out.println("October");
                    else if (month == 11) System.out.println("November");
                    else System.out.println("December");

        }else {
            System.out.println("Invalid Month");
        }
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)

Ex:
Given:
number = 10

output:

October
 */