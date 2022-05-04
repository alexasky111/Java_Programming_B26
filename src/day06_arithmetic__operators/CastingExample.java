package day06_arithmetic__operators;

public class CastingExample {
    public static void main(String[] args) {
        short numOne = 40;
        float numTwo = numOne; //short is smaller than float so no casting is needed from us

        float numThree = 100.5F; //"F" is only if decimal

        short numFour = (short)numThree; //float is bigger so we cast down to short
        System.out.println(numOne);
        System.out.println(numTwo);

        System.out.println(numThree);
        System.out.println(numFour);

        float num5 = 300; //30 is int by default, and it automatically goes up to float
        byte num6 =(byte)num5;

        double d1 = 300.1;
        int i1 = (int)d1;
        System.out.println(d1);
        System.out.println(i1);
        System.out.println((int)d1);


        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A';
        int letter2 = letter;
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
        System.out.println((int)'&');
        System.out.println((int)'p');

    }
}
