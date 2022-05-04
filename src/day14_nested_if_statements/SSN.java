package day14_nested_if_statements;

import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        /*
        inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn
         */
        Scanner input = new Scanner(System.in);
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



        }


    }
}
