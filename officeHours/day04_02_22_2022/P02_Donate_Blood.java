package day04_02_22_2022;

import java.util.Scanner;

public class P02_Donate_Blood {
    /*Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = input.nextInt();
//        System.out.println("Enter your weight");
//        int weight = input.nextInt();
        int age = 28;
        int weight = 80;


        if (age >= 18) {
            // check another condition
            if (weight >= 50) {
                //Yes we can
                System.out.println("Eligible");
            } else {
                //we cant
                System.out.println("not eligible");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
        String result =  "";

        result = (age >= 18) ?  (weight >= 50) ? "Eligible":"not eligible": "Age must be greater than 18";






    }


}


