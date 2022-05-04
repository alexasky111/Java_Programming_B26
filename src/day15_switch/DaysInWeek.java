package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day of the week: ");

        int dayOfWeek = input.nextInt();
        String day = "";

        switch (dayOfWeek) {
            case 1:
                day = "Monday"; //System.out.println("Monday")
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                day = "Not Found";

        } // printing is always after the switch! OUTSIDE
        System.out.println(day);
    }
}


