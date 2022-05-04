package day15_switch;

import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about? ");
        String day = input.nextLine();
        String details;

        switch(day) {
            case "monday": case  "mon": case "MON":
            case "Monday":
                details = "It is "+day+". We have Java from 7 to 10 pm with Saim";
                break;

            case "Tuesdays":
            case "Wednesday":
                details = "It is "+day+". We have Java from 7 to 10 pm with Saim. Also, we have office hours w/ Mehmet at 5.30 pm";
                break;
            case "Thursday":
                details = "It is "+day+". We have Soft Skills from 7 to 10 pm with Nadir.";
                break;
            case "Friday":
                details = "It is "+day+". We have No Classes";
                break;

            case "Saturday":
            case  "Sunday":
                details = "It is "+day+". We have Java from 10 am to 5 pm with Saim";
                break;
            default:
                details = "Not a valid day";

        }

        System.out.println(details);

    }
}
