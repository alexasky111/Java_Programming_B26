package day11_if_statements;

import java.util.Scanner;

public class IfStatementsHW2 {
    /*
    create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time of the day: ");

        int timeOfDay = input.nextInt();
        System.out.println("The time of the day is "+timeOfDay+" am/pm");
        boolean condition1 = timeOfDay>=6 && timeOfDay <=11;
        boolean condition2 = timeOfDay>=12 && timeOfDay<=16;
        boolean condition3 = timeOfDay>=17 && timeOfDay<=23;

        if (condition1) {
            System.out.println("Good morning "); }

        if (condition2) {
            System.out.println("Good evening ");
        }

        if (condition3){
            System.out.println("Good night ");
        }




    }
}
