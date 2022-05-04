package saims_practices_for_loopsArrayMethod;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = input.nextLine();

        char space = ' ';

        for (int i = 0; i < word.length(); i++) {

            System.out.print("" + word.charAt(i) + space); // this will give us "j a v a", bc loop keeps repeating the letters and statement is concatenated w/ a space

            if (word.contains(" ")) {

              word = word.replace(" ", "_"); // if we have first & last name for ex -> instead of space btw them we will get an underscore "_"
            }


        }


    }
}
