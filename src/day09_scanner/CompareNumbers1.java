package day09_scanner;
import java.util.Scanner;
public class CompareNumbers1 {

    public static void main(String[] args) {

          /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
     */

        Scanner input = new Scanner (System.in);

        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.println("Enter 3rd number: ");
        int num3 = input.nextInt();

        System.out.println("The sum is: "+(num1+num2+num3));

    }
}
