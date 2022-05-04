package day21_loops;

public class PrintNumbers {
    /*
    print all the even numbers from 1 to 100, but all in seperate line

    print all the odd numbers from 1 to 100, but all in one line
     */
    public static void main(String[] args) {

        int num = 2;

        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }
        System.out.println("  ");

        //approach 2:
        int i = 1;

        while (i <= 100) {
            if (num % 2 == 0) {
                System.out.println(i);
            }
            i++;   // you need to update i up until a 100, otherwise it'll run to infinite
        }

        System.out.println("  ");
        // odd numbers
        int a = 1;
        while (a <= 100) {
            System.out.print(a + " ");
            a += 2;

        }
        int b = 0;
        while (b++ <= 100) {
            if (b % 2 == 1) {
                System.out.println(b + " ");
            }
        }
        //iteration: each cycle of the loop. The statement count



        /*
            flow:
            b = 0
            b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
             if (b % 2 == 1) --> 1 % 2 == 1 --> true -> prints number

             while(b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
             if (b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

              while(b++ <= 100) --> 2 <= 100 -> loop runs and b increments to 3
         */


    }
}








