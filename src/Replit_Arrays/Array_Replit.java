package Replit_Arrays;

import java.util.Arrays;

public class Array_Replit {
    public static void main(String[] args) {
       /*
       Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]
        */
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String [] word = str.split(", ");

        String shortiest = word[0];

        String allShorts = "";

        for (String each : word) {

            if (each.length() <= shortiest.length()) {
                shortiest = each;
            }
        }
        for (String each1 : word) {
            if (each1.length() == shortiest.length()){
                allShorts += each1+" ";
            }

        }

        String [] shortWords = allShorts.split(" ");
        System.out.println(Arrays.toString(shortWords));


    }
}
