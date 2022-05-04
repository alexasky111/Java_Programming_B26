package day19_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 String inputs: ");
        String word1 = input.next().toLowerCase(); // take care of lower case right away
        String word2 = input.next().toLowerCase();
        String word3 = input.next().toLowerCase();



        String longestWord = "";
        // Goes in front word1.contains("a") in case it is FALSE we never have to execute the rest of methods

        if (word1.contains("a") && word1.length()>longestWord.length()) {
            longestWord = word1;
        }
        if (word2.contains("a") && word2.length()>longestWord.length()) {
            longestWord = word2;
        }
        if (word3.contains("a") && word3.length() > longestWord.length()) {
            longestWord = word3;
        }

        System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + "is the longest word");
/*
if(longestWord.isEmpty())
    print "No single largest word with a"
    else
    print longestWord + " is the longest word with a"
 */
    }
}
