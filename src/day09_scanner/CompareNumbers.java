package day09_scanner;

import java.util.Scanner;

public class CompareNumbers {
    /*
        create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other
     */

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); // object

        System.out.println("Please enter the number 1:");
        int num1 = input.nextInt();

        System.out.println("Please enter the number 2: ");
        int num2 = input.nextInt();

        System.out.println("The numbers are equal " + (num1 == num2));


                }
}
