package day11_if_statements;

import java.util.Scanner;

public class IfStatementsHW3 {
    /*
    create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sales amount: ");
        double salesAmount = input.nextDouble(); // 85_000 - hardcoded bf
        boolean condition1 = salesAmount<10_000;
        boolean condition2 = salesAmount>=10_000 && salesAmount<15_000;
        boolean condition3 = salesAmount>=15_000;

        if (condition1){
            System.out.println("Sorry, you don't get any bonus");
            int bonusNumber1 = 0;
            System.out.println("Your bonus number is $"+bonusNumber1);
        }

            if(condition2){
                System.out.println("Congrats you get a bonus of $5000 $");
                int bonusNumber2 =5000;
                System.out.println("Your bonus number is $"+bonusNumber2);
            }

            if(condition3){
                System.out.println("Congrats you get a bonus of $7000 $");
                int bonusNumber3 = 7000;
                System.out.println("Your bonus number is $"+bonusNumber3);
            }







        }

    }

