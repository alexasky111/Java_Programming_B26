package day09_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        /*
        write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
         */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary: ");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work per week? ");
        int hoursPerWeek = input.nextInt();

        double hourlyRate = salary/(hoursPerWeek*52);

        System.out.println("The hourly rate is: "+hourlyRate);



    }
}
