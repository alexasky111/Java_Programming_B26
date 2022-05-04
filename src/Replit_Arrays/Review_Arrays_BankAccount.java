package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Review_Arrays_BankAccount {
    public static void main(String[] args) {
        String [] bankAccount1 = {"Alex P", "check", "47395987", "85953"};
        System.out.println(bankAccount1.length);
        System.out.println(Arrays.toString(bankAccount1));
        System.out.println("All of info: "+bankAccount1[0]+bankAccount1[1]+bankAccount1[2]+bankAccount1[3]);

//        System.out.println("==================================");
//        String [] bankAccount2 = new String [4];
//        System.out.println(Arrays.toString(bankAccount2));
//        bankAccount2[0] = "Jamie";
//        System.out.println(Arrays.toString(bankAccount2));
//        System.out.println("===================================");
//
//        String [] bankAccount3 = new String [4];
        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your name");
//        bankAccount3[1] = input.nextLine(); // we can store to the array
//        System.out.println("Enter your account ");
//        bankAccount3[2] = input.nextLine();
//        System.out.println("enter bal");
//        bankAccount3[3] = input.nextLine();
//        System.out.println(Arrays.toString(bankAccount3));
//        System.out.println("==================================");


        String [] bankAccount4 = new String[4];
        String[] questions = {"full name","acc type", "acc num", "bal"};
        for (int i = 0; i < bankAccount4.length; i++) {
            System.out.println("Enter your "+questions[i]);
            bankAccount4[i] = input.nextLine(); // will allow to enter scanner 4 times and will store data in the array

        }
        System.out.println(Arrays.toString(bankAccount4));

















     }
}
