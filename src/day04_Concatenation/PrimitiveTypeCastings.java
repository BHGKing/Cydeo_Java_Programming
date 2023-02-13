package day04_Concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

/*
 In order ascending implicit casting
 1. byte
    |
    v
 2. short
    |
    v
 3. int
    |
    v
 4. long
    |
    v
 5. float
    |
    v
 6. double
*/
        //--------- Implicit Casting ----------------

        byte a = 15;

        short b = (short)a;
        // short b = (short)a; smaller primitive type to larger primitive type

        System.out.println(b);

        int c = a;  // implicit casting

        long d = 3000L; //default 3000 is an int, must add 'l' or 'L'

        float f = d; // implicit casting
        //--------- Implicit Casting ----------------



        //--------- Explicit Casting ----------------

        int x = 100;

        byte y = (byte) x; // byte y = x; will give error must MANUALLY cast (Explicit Casting)

        float z = 20.8F;

        short q = (short)z; // z = 20.8 but after casting will only take whole integer number

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte)n1; // byte n2 = n1; will NOT work as a double can only be automatically casted to double

        System.out.println(n2);

        System.out.println("----------------------------------------------");

        int num = 500;

        byte result = (byte) num; // explicit casting
        // anything higher/lower than -128 to 127 will give a negative/positive number ONLY FOR BYTE

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        System.out.println("----------------------------------------------");

        double u = 3000.5;

        int p = (int) u; // explicit casting

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1);




    }
}