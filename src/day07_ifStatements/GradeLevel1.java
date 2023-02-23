package day07_ifStatements;

public class GradeLevel1 {
    public static void main(String[] args) {

        int grade = 6;


        if (grade >= 1 && grade<= 18){

                    if (grade <= 5){
                        System.out.println("Elementary School");
                    }else if (grade <= 8){
                        System.out.println("Middle School");
                    }else if (grade <= 12) {
                        System.out.println("High School");
                    } else if (grade <= 16) {
                        System.out.println("College");
                    } else {
                        System.out.println("Grad School");
                    }

        }else {
            System.out.println("Invalid Grade Level");
        }
    }
}
