package day06_arithmetic__operators;

public class PracticeCasting {
    public static void main(String[] args) {

        /*
        declare and assign a short variable
declare and assign a byte variable with the short value above. Cast if needed

declare and assign a float variable
declare and assign a double variable with the float value above. Cast if needed

declare and assign a double variable
declare and assign a int variable with the double value above. Cast if needed

declare and assign a long variable
declare and assign a int variable with the long value above. Cast if needed
         */

        short num1 = 32_700;
        byte num2 = (byte)num1;

        System.out.println(num1);
        System.out.println(num2);

        float num3 = -3_402823F;       //TODO: Why float and double haven't changed?
        double num4 = num3;

        System.out.println(num3);
        System.out.println(num4);

        double num5 = 1.75;
        int num6 = (int)num5;

        System.out.println(num5);
        System.out.println(num6);

        long num7 = -9_223_372L;
        int num8 = (int)num7;

        System.out.println(num7);
        System.out.println(num8);       //TODO: Why long and int haven't changed?

    }
}
