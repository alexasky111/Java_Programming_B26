package day09_scanner;
import java.util.Scanner;
public class ScannerHW6 {
    /*
Ask the user to enter an int number. Determine if the number is even or odd
Print a boolean for both even and odd
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int number: ");
        int wholeNumber = input.nextInt();

        boolean isEven = wholeNumber%2==0;
        boolean isOdd = wholeNumber%2!=0; // isOdd = !isEven

       String numbersKind = ("Is the number even? "+isEven+"\nIs the number odd? "+isOdd);
        System.out.println(numbersKind);

    }
}
