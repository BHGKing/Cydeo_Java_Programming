package day14_ForLoop;

public class MethodOverloadingIntro {

    public static void methodA(){


    }

    public static void methodA(int a){


    }

    public static void methodA(double b){ // cannot pass single same parameter (ex: methodA(int a)  methodA(int b))


    }

    public static void methodA(int a, int b){ // but can add an extra parameter to allow overloading


    }


}
