package day11_if_statements;

import java.util.Scanner;

public class BankAccount {

    /*Task: Hard code -> Dynamic

    Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over */

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("What is your balance? ");
        double accountBalance = input.nextDouble();

        System.out.println("How much are you withdrawing? ");
        double toWithdraw = input.nextDouble();

//        double accountBalance = 100; these are the hardcoded values
//        double toWithdraw = 500;
// withdraw some amount of money from my balance


        accountBalance -=toWithdraw; // accountBalance = accountBalance - toWithdraw

        if(accountBalance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            System.out.println("Balance before fee "+accountBalance);
            accountBalance-=100; // balance = balance - 100;
        }
        System.out.println("Balance "+accountBalance);
    }
}
