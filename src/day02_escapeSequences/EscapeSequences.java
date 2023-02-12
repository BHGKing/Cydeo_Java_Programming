package day02_escapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello Students\nToday we have java class"); //*New line with EscapeSequences is (\n)

        System.out.println("-------------------------------------------");

        System.out.println("\tJava Programming Language");              //*Indention with EscapeSequence is (\t)
        System.out.println("\t\tJava Developer Course Batch 1");

        System.out.println("-------------------------------------------");

        System.out.println("\\");                                       //*Single backslash with EscapeSequence is (\\)

        System.out.println("-------------------------------------------");

        System.out.println("\"");                                       //*Single Double quote with EscapeSequence is (\")

        System.out.println("-------------------------------------------");

        System.out.println("My favorite TV show is \"N.C.I.S\"");       //*Backslash with EscapeSequence is (\")

    }
}

/*
    1. \n
    2. \t
    3. \\
    4. \"
 */

/*
Warmup task:
	1. Create a sub folder named "day02" under the "Java Course Materials" folder

	2. Go to LMS -> Java Course -> Modules -> Java Day02
	   		download the pdf file and save it under the sub folder "day02"

	3. Open "Java_Programming" project in intelliJ, and create a package named "day02_escapeSequences"

	4. Create a Java file named "EmployeeInfo" and write a program that can display the following output on the console:

			output:
				Name: $yourName
				Gender: $gender
				Age: $age
				Job Title: Java Developer
				Company: $companyName
				Salary: $salary

			Note: Put your own info for name, gender etc
 */