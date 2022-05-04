package day07_unary_operators.day12_multi_if_statements;

import java.util.Scanner;

public class Replit1 {

    class Main {

    }
        public static void main(String[] args) {
            //WRITE YOUR CODE BELOW:

            Scanner scan = new Scanner(System.in);

            int num1, num2, num3;
            System.out.println("Enter first number: ");
            num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            num2 = scan.nextInt();
            System.out.println("Enter third number: ");
            num3 = scan.nextInt();

            if (num1 < num2 && num2 > num3) {
                System.out.println("middle number is: " + num3);
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("middle number is: " + num2);
            } else if (num1 > num2 && num2 < num3) {
                System.out.println("middle number is: " + num1);
            }


        }}