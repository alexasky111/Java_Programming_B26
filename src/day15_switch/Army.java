package day15_switch;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen? ");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you a resident? ");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have a high school diploma? ");
        boolean hasHighSchool = input.nextBoolean();
        System.out.println("How old are you? ");
        int age = input.nextInt();
/*
Another approach you could've done is check if ALL ARE TRUE ? IF YES -> YOU QUALIFY
 */
        // start by checking all of the values;
        // '&&' has higher priority so we must group '||'

        if ((isCitizen || isResident) && hasHighSchool && (age>=18 && age<=35)) {
            System.out.println(" You are qualified for the army! ");}
        else {
            if (!isCitizen && !isResident) // You are not qualified if you are not a citizen AND not a resident => !(isCitizen || isResident)
            {
                System.out.println("You must be a citizen or a resident");
            }
            if (!hasHighSchool) {
                System.out.println("You must have a high school diploma");
            }
            if (age < 18 || age > 35) {
                // we are flipping the (age >= 18 && age<=35) to have a logical statement
                System.out.println("Your age must be between 18 to 35 years old");
            }
        }


            }




    }

