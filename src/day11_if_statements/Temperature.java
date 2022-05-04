package day11_if_statements;

import java.util.Scanner;

public class Temperature {
/*  Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");

        int temperature = input.nextInt();
        if(temperature>=70){
            System.out.println("Its a nice day\nGo outside, but with your laptop to code java");} else {
            System.out.println("Its too cold\nCode more java");

            }
        }


    }

