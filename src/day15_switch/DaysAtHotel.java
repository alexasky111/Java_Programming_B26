package day15_switch;

import java.util.Scanner;

public class DaysAtHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days will you stay? ");
        int numberOfDays = input.nextInt();

        System.out.println("How many people are in the room? ");
        int peopleInRoom = input.nextInt();


        double price = 0;
        boolean isValid = true;
        String typeOfRoom = "";


        switch (peopleInRoom) {
            case 1:
                typeOfRoom = "single room";
                price = numberOfDays * 100;
                break;
            case 2:
                typeOfRoom = "double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                typeOfRoom = "large room";
                price = numberOfDays * peopleInRoom * 150;
                break;
            case 5:
            case 6:
            case 7:
                typeOfRoom = "suite";
                price = numberOfDays * 5000;
                break;

            default:
                isValid = false;
                System.out.println("Sorry we don't have any available rooms for that size party");


        }
        if(isValid) {
            System.out.println("party size: " + peopleInRoom + "\nroom type: " + typeOfRoom + "\nprice: " + price);
        }

    }
}
