package day12_Custom_Methods_Intro;

public class EmailTask {
    public static void main(String[] args) {

        String email = "cydeo_school@gmail.com";

        String firstName = email.substring(0, email.indexOf("_")); // from 0 - "_"

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")); // from "_" + 1 = s to "@"

        String rest = email.substring(email.indexOf("@")); // from "@" till the end

        System.out.println(firstName);

        System.out.println(lastName);

        System.out.println(rest);

        email = lastName + "_" + firstName + rest;

        System.out.println(email);
    }
}
/*
2. Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */