package day05_variables;

public class TypeCasting {

    public static void main(String[] args) {
        byte b = 40;
        int i = b; //the byte value is automatically converted to int, because byte is smaller than int

        int i2 = 100;
        byte b2 = (byte) i2; //int is bigger that byte, so we mist cast. We cast the int type - i2 to a byte type using (byte)

        // Casting is just the converting data type which we just may need!

        int i3 = 10;
        long l1 = i3; // int is smaller than long, so it will automatically cast

        long l2 = 200;
        int i4 = (int)l2; //im trying to go from long to int. long is bigger than int, so i must cast it

        long l3 = 100000000000L;

        long p3 = 100;
        byte b6 = (byte)p3;

        // ANY number I type by the compiler is INT or DOUBLE type

        short s1 = 100;
        byte b3 = (byte)s1;  //К какому откуда, если с Большего к Меньшему!

        double d = 50;
        int i5 = (int)d;

        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b1 = (byte)d2;



    }
}
