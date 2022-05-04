package day14_nested_if_statements;

import java.util.Scanner;

public class BooleanSSN {

    public static void main(String[] args) {
 /*       Scanner input = new Scanner(System.in);
        int expectedPin = 1552;
        int expectedSSN = 1234;


        System.out.println("Please enter your pin: ");
        int pin = input.nextInt();
        System.out.println("Please enter your last 4 digits of SSN: ");
        int ssn = input.nextInt();

        if (expectedPin == pin && expectedSSN == ssn) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if (expectedPin != pin) {
                System.out.println("invalid pin");
            }
            if (expectedSSN != ssn) {
                System.out.println("invalid ssn");
            } //in multi branch you can see BOTH wrong in Multi branch you can see the 1st one that is false, multibranch only runs ONE branch

  */
        Scanner input = new Scanner(System.in);
        int expectedPin = 1552;
        int expectedSSN = 1234;

        System.out.println("Please enter your pin: ");
        int pin = input.nextInt();
        boolean validPin = expectedPin==pin;
        System.out.println("Please enter your last 4 digits of SSN: ");
        int ssn = input.nextInt();
        boolean validSSN = expectedSSN==ssn;
        if (validPin==validSSN) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if (!validPin) {
                System.out.println("invalid pin");
            }
            if (!validSSN) {
                System.out.println("invalid ssn");
            } //in multi branch you can see BOTH wrong in Multi branch you can see the 1st one that is false, multibranch only runs ONE branch



        }


        }




    }



