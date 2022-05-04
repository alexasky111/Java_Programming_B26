package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****************Welcome to Starbucks*************\n\t\tPlease enter the size of your drink: ");
        String size = input.next();

        double price = 0;
        int calories = 0;
        boolean validOrder = true; // by making it true I pick all orders are valid when I have an invalid order I will change the value to "false" that way the last statement won't print !

        switch(size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.0;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("Sorry, we don't have that size");
                validOrder = false;
        }

        if(validOrder){
        System.out.println("Your coffee size is "+size+"\nThe price is $"+price+"\nThere are "+calories+" calories");
        }



    }
}
