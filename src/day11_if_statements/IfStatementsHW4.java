package day11_if_statements;

import java.util.Scanner;

public class IfStatementsHW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        create a double variable for your hourly rate
create a double variable for the number of hours worked

calculate your net pay, with consideration of overtime pay

	if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
		(if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
         */

        double hourlyRate = 20;
        double hoursWorked = 70.99;
        double regular = 40*hourlyRate;
        double overtime = regular+((hoursWorked-40)*(hourlyRate*1.5)); // this approach works but if you put in the "if" statement than it would make sense more because "if" statement should have the condition !!


        if (hoursWorked>40){

            System.out.println("Your Net Pay is $"+overtime);

        } else {
            System.out.println("Your Net Pay is $"+regular);

        }
    }





    }
