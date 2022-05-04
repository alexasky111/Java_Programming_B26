package day09_scanner;
import java.util.Scanner;
public class ScannerHW4 {

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
        boolean isDivisibleBy2 = myNumber%2==0;
        boolean isDivisibleBy3 = myNumber%3==0;
        boolean isDivisibleBy5 = myNumber%5==0;

        System.out.println(myNumber+" is divisible by 2: "+isDivisibleBy2);
        System.out.println(myNumber+ " is divisible by 3: "+isDivisibleBy3);
        System.out.println(myNumber+ " is divisible by 5: "+isDivisibleBy5);






    }
}
