package day06_Intro_If_Statements;

public class Cigarettes {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 21 && age < 100){
            System.out.println("You are eligible to buy Cigarettes");
        }

        if (age < 21 || age > 100){
            System.out.println("You are not eligible to buy Cigarettes ");
        }
    }
}
/*
    2. A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
Ex:
    age = 20
output:
    You are not eligible to buy Cigarettes
 */