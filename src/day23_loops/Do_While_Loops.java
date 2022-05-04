package day23_loops;

import java.util.Scanner;

public class Do_While_Loops {
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
        Scanner input = new Scanner(System.in);

        int secretNum = 3;
        int guessNum;
        int attempts = 0;

        do {
            System.out.println("Please enter the number: ");
            guessNum = input.nextInt();
            attempts++;


        } while (attempts < 3 && secretNum != guessNum);

        if (secretNum == guessNum) {
            System.out.println("you guessed the number");
        } else if (secretNum < 3) {
            System.out.println("too low");
        } else if (secretNum > 3) {
            System.out.println("too high");
        } else {
            System.out.println("no more attempts left");
        }

    }

}
