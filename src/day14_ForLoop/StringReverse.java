package day14_ForLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(reverse(str));

    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){

            reverse += str.charAt(i);

        }

        return reverse;

    }





}
