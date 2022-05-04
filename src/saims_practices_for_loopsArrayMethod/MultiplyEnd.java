package saims_practices_for_loopsArrayMethod;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        /*
        Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
	Ex:
		Input:
		    Hello?
			3
		Output:
			Hello????
	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        char space = ' ';

        for (int i = 0; i < num; i++) { // our string

            word += word.substring(word.length() - 1);
        }
        System.out.println(word);

    }
}
