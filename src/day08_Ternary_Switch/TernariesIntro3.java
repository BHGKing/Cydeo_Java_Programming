package day08_Ternary_Switch;

public class TernariesIntro3 {
    public static void main(String[] args) {

        int score = 60;

        String result = (score >= 0 && score <= 100)? (score >= 60)? "Passed" :"Failed" :"Invalid";

        System.out.println(result);







    }
}
