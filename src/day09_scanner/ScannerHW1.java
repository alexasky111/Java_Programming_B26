package day09_scanner;
import java.util.Scanner;
public class ScannerHW1 {
/*
    Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price: ");
        double price = input.nextDouble();

        System.out.println("Please enter the quantity: ");
        int quantity = input.nextInt();

        System.out.println("The Revenue is: $"+(price*quantity)); // you should've declared a variable double revenue = price*quantity, so you can reuse it!
        //I could do "The Revenue is: $"+(input.nextDouble() * input.nextInt());

    }
}
