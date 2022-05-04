package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         /*
Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        System.out.println("Enter a sentence: ");
        String str = in.nextLine();
        String fixed = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                fixed += "_ "; // because every character has a space
            } else {
                fixed += str.charAt(i) + " "; // I'm putting a character plus a space next to it
            }


        }

        System.out.println(fixed.trim());

    }
}
