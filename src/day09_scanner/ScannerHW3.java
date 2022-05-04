package day09_scanner;
import java.util.Scanner;
public class ScannerHW3 {
/*Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age please: ");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number: ");
        long favNumber = input.nextLong();

        System.out.println("Enter your favorite book: ");
        String favBook = input.next();



    }
}
