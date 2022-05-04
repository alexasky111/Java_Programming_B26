package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // declare a scanner variable; popular names for scanner: scan, input, scanner, keyboard

        System.out.println("Enter the price of the item: ");
        double price = scan.nextDouble(); //double-check the name of Scanner

        System.out.println("Enter the quantity: ");
        int quantity = scan.nextInt();

        double revenue = price * quantity;

        System.out.println(revenue);



    }


}
