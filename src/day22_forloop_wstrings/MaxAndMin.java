package day22_forloop_wstrings;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
    /*
    program that asks user to enter 5 num and return the biggest/smallest from 5
     */
        // repeated steps is a biggest
        // repeated steps is a smallest
        Scanner input = new Scanner(System.in);
        int max = -2147483648; //2147483647
        int min = 2147483647; //-2147483648
        int n = 0; // how many times we run our loop


        while ( n < 5) {
            n++;
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number>max) {
                max = number;
            }
            if (number<min){
                min = number;
            }

        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);









    }
}
