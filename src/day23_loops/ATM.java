package day23_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to ATM ");

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        } while (attempts < 3 && validPin != userPin);
            //If pin is invalid I want to repeat my code -> ALLOWS TO RETRY
        if(validPin==userPin){
            System.out.println("logged in");
        } else {
            System.out.println("Logged out");
        }





    }
}
