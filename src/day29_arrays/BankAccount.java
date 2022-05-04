package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
    /*
        0 - full name
        1 - account type
        2 - account number
        3 - balance
     */

        String [] bankAccount= {"Brad Smith", "Checking","1000084488", "100,000"};
        System.out.println(bankAccount.length);
        System.out.println(Arrays.toString(bankAccount));
        System.out.println("Name: "+bankAccount[0]+", "+"Account type: "+bankAccount[1]+", "+"Bank balance: "+bankAccount[2]+", "+"Bank Account: "+bankAccount[3]);

        String [] bankAccount2 = new String[4]; //I need to give the size of Array right away
        bankAccount2 [0] = "Jamie Fox";
        bankAccount2 [1] = "Savings";
        bankAccount2 [2] = "12653246";
        bankAccount2 [3] = "37378383";
        //bankAccount2 [20] - out of bound
        System.out.println(Arrays.toString(bankAccount2));

//        String [] bankAccount3 = new String[4];
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your 1st name");
//        String firstName = input.nextLine();
//        bankAccount3[0] = firstName; // You can use the separate variable instead of input.nextLine();
//        System.out.println("Enter account type");
//        bankAccount3[1] = input.nextLine();
//        System.out.println("Enter your account number");
//        bankAccount3[2] = input.nextLine();
//        System.out.println("Enter your balance");
//        bankAccount3[3] = input.nextLine();
//        System.out.println(Arrays.toString(bankAccount3));


        String [] bankAccountFour = new String[4];
        String [] questions = {"Full name", "Account type", "Account number", "Balance"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your "+ questions[i]);
            bankAccountFour[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(bankAccountFour));











    }
}
