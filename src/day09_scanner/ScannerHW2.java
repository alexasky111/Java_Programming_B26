package day09_scanner;
import java.util.Scanner;
public class ScannerHW2 {
    /* Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st angle number: ");
         float num1 = input.nextFloat();

        System.out.println("Enter 2nd angle number: ");
        float num2 = input.nextFloat();

        System.out.println("Enter 3rd angle number: ");
        float num3 = input.nextFloat();

        System.out.println("Is a triangle: "+(num1+num2+num3==180.0));
        System.out.println("Is a circle: "+(num1+num2+num3==360));


    }
}
