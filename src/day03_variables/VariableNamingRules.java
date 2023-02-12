package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        // age of the student is 28
        // salary is 10000

        int age = 28;
        int salary = 10000;

        // int age = 32; //Variable name MUST be unique (age1)

        int phoneNumber = 123456789; // camel Case

        double salaryBeforeTax = 100000.5; //camel Case Text

        double salary_after_tax$ = 80000.5; // no_camel_case_needed_for(_)

        System.out.println("---------------------------------------------------------------");

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        // double abstract = 5.5; // variable name CANNOT be a java reserved word
        // double final = 85.5;

        System.out.println("---------------------------------------------------------------");

        // gender is male
        String gender = "Male";

        String fullName = "Cydeo school";

        System.out.println(gender);
        System.out.println(fullName);




    }

}
