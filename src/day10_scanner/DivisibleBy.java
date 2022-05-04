package day10_scanner;

import java.util.Scanner;

public class DivisibleBy {
    /*
   Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

   Ex:
   Enter a number
   65

   65 is divisible by 2: false
   65 is divisible by 3: false
   65 is divisible by 5: true
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int myNumber = input.nextInt();

        boolean by2 = myNumber % 2 == 0;
        boolean by3 = myNumber % 3 == 0;
        boolean by5 = myNumber % 5 == 0;

        System.out.println(myNumber+" is divisible by 2: "+by2);
        System.out.println(myNumber+" is divisible by 3: "+by3);
        System.out.println(myNumber+" is divisible by 5: "+by5);


    }
}
