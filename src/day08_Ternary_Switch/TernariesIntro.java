package day08_Ternary_Switch;

public class TernariesIntro {
    public static void main(String[] args) {

        int score = 85;

        String result;

        if(score >= 60){
            result = "passed";
        }else {
            result ="Failed";
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------------");

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);

    }
}
