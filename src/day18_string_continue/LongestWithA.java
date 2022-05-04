package day18_string_continue;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 String inputs: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        String result = "";
        if ((word1.length() > word2.length() && word1.length() > word3.length()) && word1.contains("a")) {
            result = "The longest word is " + word1;
        } else if ((word2.length() > word1.length() && word2.length() > word3.length()) && word2.contains("a")) {
            result = "The longest word is " + word2;
        } else if ((word3.length() > word1.length() && word3.length() > word2.length()) && word3.contains("a")) {
            result = "The longest word is " + word3;
        }
        System.out.println(result);


    }
}
