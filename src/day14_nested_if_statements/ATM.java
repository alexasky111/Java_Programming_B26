package day14_nested_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to ATM***\n Please Enter Your card and then type your pincode: ");

        int pinCode = input.nextInt();
        int expectedPin = 2342;
// Why multibranch -> because I need to pick only ONE option, it is about the execution order, I don't need to see all the options
        if (pinCode == expectedPin) {
            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("\t1)Check balance");
            System.out.println("\t2)Withdraw");
            System.out.println("\t3)Deposit");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Your balance is $" + 1_000_000);
            } else if (option==2){
                System.out.println("How much do you want to withdraw? ");
                double money = input.nextDouble();
                System.out.println("Withdrawing $"+ money);
            } else if (option==3) {
                System.out.println("Please deposit the $ ");
            } else {
                System.out.println("Invalid selection. Exiting account");
            } // since we put the right pin we will face some options, that is why if is nested!

        } else {
            System.out.println("Invalid pin.");
        }


    }
}
