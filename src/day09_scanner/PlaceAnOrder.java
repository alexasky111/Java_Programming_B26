package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    /*
    Challenge for today: Try it yourself and see otherwise we will go through it together.

- Place an order
    - Ask the user to enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Product Name: ");
        String productName = input.nextLine();

        System.out.println("Enter the price of "+productName);
        double price = input.nextDouble();

        System.out.println("How many "+productName+" do you want to buy? ");
        int quantity = input.nextInt();

        input.nextLine(); // this will grab the enter input from the above line

        System.out.println("Enter your Full Name: ");
        String fullName = input.nextLine();


        double totalCost = price*quantity;

        String myOrder = (fullName+", your order for "+quantity+" "+productName+" has been placed. Your total is $"+(int)totalCost+".");

        System.out.println(myOrder);


    }
}
