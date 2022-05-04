package day06_arithmetic__operators;

public class DifferentTypes {
    public static void main(String[] args) {
        //Both int
        System.out.println(10 - 5);
        System.out.println(10 * 5);

        //double / int => double
        System.out.println(10.0/5);

        //double / double => double
        System.out.println(10.0 / 5.0);

        // int / double => double
        System.out.println(10/5.0);

        System.out.println((int)(10.0 / 5.0));


        System.out.println((int)10.5 / 5); //     (int) -> casting (int) 10.5 -> 10

        byte b1 = 10;
        byte b2 = 20;
//        byte sum = b1 + b2, -> this doesn't work bc the dafault type is int

        int sum = b1 +b2;
        byte sumByte = (byte)(b1 +b2);

        System.out.println(sum);
        System.out.println(sumByte);


            }
}
