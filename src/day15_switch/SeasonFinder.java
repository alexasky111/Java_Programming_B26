package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****Please enter the number of the month****");
        int monthNumber = input.nextInt();
        String nameOfSeason = "", itemOne = "", itemTwo = "", itemThree = "";
        boolean isASeason = true;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                nameOfSeason = "winter";
                itemOne = "winter coat";
                itemTwo = "gloves";
                itemThree = "hat";

                break;
            case 3:
            case 4:
            case 5:
                nameOfSeason = "spring";
                itemOne = "light jacket";
                itemTwo = "scarf";
                itemThree = "beanie";
                break;
            case 6:
            case 7:
            case 8:
                nameOfSeason = "summer";
                itemOne = "t-shirt";
                itemTwo = "shorts";
                itemThree = "pair of flip-flops";
                break;
            case 9:
            case 10:
            case 11:
                nameOfSeason = "fall";
                itemOne = "hoodie";
                itemTwo = "jeans";
                itemThree = "pair of sneakers";
                break;

            default:
                isASeason = false;
                System.out.println("Sorry there is no season with such name");
        }
        if (isASeason) {
            System.out.println("It is " + nameOfSeason + ", so wear a " + itemOne + ", " + itemTwo + " and a " + itemThree);
        }

    }
}
