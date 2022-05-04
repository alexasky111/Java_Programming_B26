package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
        Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
Condition w/ counting words w/ a help of counting spaces to separate the words
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim(); // to avoid extra spaces not related to words
        int spaces = 0;
// i = 0 we start from the first index
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){ // str.substring(i , i + 1) gives you one character
                spaces++; // space characters in the sentence
            }
        }

        System.out.println("Number of words: "+ (spaces + 1)); // this makes it clear that we have 4 words, but three spaces; 2 words --> 1 space, so we need additional to count the words not spaces










    }
}
