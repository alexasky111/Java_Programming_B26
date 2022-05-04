package day09_scanner;
import java.util.Scanner;
public class LeapYear {
    /*
    create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4, or divisible by 100 but not divisible by 400. Print true or false.

Hint: use remainder operator
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt(); // this is how I use my input dynamically instead of hard code !!!

        boolean isLeapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0); // you could seperate in different booleans & combine them together, we are grouping logical operators
        System.out.println("Is this year a leap year: "+ isLeapYear);
    }
}
