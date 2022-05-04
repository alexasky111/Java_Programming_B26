package day22_forloop_wstrings;

import java.util.Scanner;

public class SecretNum {
    public static void main(String[] args) {
        /*
        create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
         */
        Scanner input = new Scanner (System.in);
        int secretNum = 80; // in the future we will learn how to make random num
        int guess ;

        do{
            System.out.println("Guess a num from 1-100");
            guess = input.nextInt();
            if (guess > secretNum){
                System.out.println(guess + " is too high");
            } else if (guess < secretNum){
                System.out.println(guess + " is too low");
            }

        } while(guess != secretNum); // when should you keep running the loop: when the guess num is not equal secretNum
        System.out.println("You guessed correctly"); // You want the loop to keep running when you didn't guess correctly




    }
}
