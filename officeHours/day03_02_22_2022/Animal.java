package day03_02_22_2022;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        /* 1-Create  a program that accepts animal as String
        DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animals - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please type the name of the animal: ");
        String animal = input.next();

        String details = "";

       switch(animal) {
           case "DOG":
           case "dog":
               details = " is domestic animal";
               break;
           case "CAT":
           case "cat":
               details = " is domestic animal";
               break;
           case "TIGER":
           case "tiger":
               details = " is wild  animal";
               break;
           default:
               details = " unknown animal";

       }
        System.out.println(animal+details);














    }
}
