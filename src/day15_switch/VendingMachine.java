package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine. \nPlease select one of the following: \n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();

        String item = "";

        switch (selection) {
            case "Drinks":
                System.out.println("You chose drinks: press a number: \n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    item = "water";
                } else if (drinkNumber == 2) {
                    item = "soda";
                } else if (drinkNumber == 3) {
                    item = "juice";
                }
                break;
            case "Snacks":
                System.out.println("You chose snacks: press a number: \n\t4)Chips\n\t5)Cookies");
                int snackNumber = input.nextInt(); //I chose my variable ans stored it in the Scanner
                if (snackNumber == 4) {
                    item = "chips";
                } else if (snackNumber == 5) {
                    item = "cookies";
                }                               // now I am evaluating

                break;
            case "Gum":
                item = "Generic item";
        } // end of switch

        System.out.println("Vending....." + item);

    } // end of the main method
} // end of the class
