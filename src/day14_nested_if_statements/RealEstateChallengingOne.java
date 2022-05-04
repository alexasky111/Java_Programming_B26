package day14_nested_if_statements;

import java.util.Scanner;

public class RealEstateChallengingOne {
    public static void main(String[] args) {
      /*  We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money"

        Data based on neighborhood name:
        name - Hills
        average price - 80,000 - 100,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 55,000 - 90,000
        rating - 3.5
        gated - no
        allow pets - yes
        name - Highland

        average price - 120,000 - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 160,000 -201,000
        rating - 4.8
        gated - yes
        allow pets - yes

        If the budget is not in any range print: "No available houses"
               */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your max budget? ");
        int budget = input.nextInt(); //In this case Java can never complain because now I have a value! I've declaired and assigned!
        String name = "", range = "";
        double rating = 0;
        boolean gated = false, allowPets = false, isAvailable = true;


        if (budget > 0 && budget < 300_000) {
            System.out.println("Lets see if there is any houses");
            if (budget >= 55_000 && budget <= 75_000) {
                name = "Oaks";
                range = "55,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (budget >= 80_000 && budget <= 100_000) {
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;


            } else if (budget >= 120_000 && budget <= 150_000) {
                name = "Highland";
                range = "120,000 - 150,000";
                rating = 4.5;
                gated = true;
                allowPets = false;

            } else if (budget >= 160_000 && budget <= 201_000) {
                name = "Canyon";
                range = "160,000 - 201,000";
                rating = 4.8;
                gated = true;
                allowPets = true;

            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }

            if (isAvailable) {

                String ad = "Name of the neighbourhood: " + name + "\nPrice range: " + range + "\nRating is: " + rating;

                ad += "\nGated: " + (gated ? "Yes" : "No"); //concatination w/ strings "+=" but w/ numbers - math

                ad += "\n" + (allowPets ? "They allow pets" : "They don't allow pets");

                System.out.println(ad);
            }

        }else {
                if (budget <= 0) {
                    System.out.println("Your budget cannot be less than 0");
                } else {
                    System.out.println("Too much money for this agency");
                }
            }


        }
    }
