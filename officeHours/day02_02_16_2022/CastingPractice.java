package day02_02_16_2022;

public class CastingPractice {
    /*
    byte < short < Int < long < float < Double

    1 - Implicit Casting
    double a = 5;

   - Done by Complier
   - Smaller type to Bigger Type
   - No loss data
   - Called as Widening

    2 - Explicit Casting
    double b = 5.3;
    int i = b;

    - Done by developer
    - larger type to smaller type
    - we may lose data
    - called as narrowing
     */
    public static void main(String[] args) {
        //byte to short
        byte b=10;
        short s=b; // it is implicit casting

        // double to int

        double a = 5.3;
        int i = (int)a;

        System.out.println(i);

        //long to int            // int to long ==>Implicit Casting
        long l = 999999;
        int i2 = (int)l;

        double d = 15.2;
        int i3=(int)d;
        System.out.println(i3);

    }





}
