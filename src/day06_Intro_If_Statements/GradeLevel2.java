package day06_Intro_If_Statements;

public class GradeLevel2 {
    public static void main(String[] args) {

        int gradeLevel = 16;

        String result = "";

        if(gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elemetary";
        }
        if (gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle School";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }
        if (gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }
        if (gradeLevel >= 17 && gradeLevel <= 16){
            result = "Grad School";
        }

        System.out.println("result = " + result);
    }
}
