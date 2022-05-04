package day07_unary_operators.day12_multi_if_statements;

import java.util.Scanner;

public class Diver {
    /*
    create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int oxygenLevel = input.nextInt();
        String message;

        if (oxygenLevel>90) {
           message = "Your tank is full";
        } else if (oxygenLevel>80) {
            message = "Your are still okay";
        } else if (oxygenLevel>70) {
            message = "Don't go too far!";
        } else if (oxygenLevel>60) {
            message = "Start to head back";
        } else if (oxygenLevel>50){
            message = "Be careful now you at 50%";
        } else {
            message = "Head back NOW !";
        }

        System.out.println(message);
    }

}
