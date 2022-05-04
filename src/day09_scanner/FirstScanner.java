package day09_scanner;
//always btw package and class name
import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter a number");
        int number = input. nextInt();
        System.out.println("This is your number "+number);
    }

}
