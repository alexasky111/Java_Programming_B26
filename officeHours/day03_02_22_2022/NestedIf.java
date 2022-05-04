package day03_02_22_2022;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();


        if (age >= 18 && weight > 50) {
            System.out.println("You are eligible to donate blood");
        } else {
            if (age >=18 && weight <= 50) {
            System.out.println("You are not eligible to donate blood");
        }   else {
                System.out.println("Your age must be greater than 18");
            }

    }


}

    }








