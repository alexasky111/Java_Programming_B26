package day15_switch;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your month: ");
        String month = input.next();
        String message = "";
        int daysInMonth;


        switch(month){

            case "January":
            case "March":
            case"May":
            case"July":
            case"August":
            case"October":
            case"December":
                daysInMonth = 31;
                message = "There are "+daysInMonth+" days in this month";
                break;
            case"April":
            case"June":
            case"September":
            case"November":
                daysInMonth = 30;
                message = "There are "+daysInMonth+" days in this month";
                break;
            case"February":
                daysInMonth = 28;

                message = "In a common year there are "+daysInMonth+" days in this month. In a leap year there are "+(daysInMonth+1)+" days.";
                break;
            default:
                message = "invalid month name";
        }

        System.out.println(message);







    }
}
