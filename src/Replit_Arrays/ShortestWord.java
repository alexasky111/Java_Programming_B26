package Replit_Arrays;

public class ShortestWord {
    public static void main(String[] args) {
        /*
        Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...
Output: [short1, short2, short3, etc...]
Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators
Example:
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
Output:
  [old, cat, ray]
         */
//        Scanner input = new Scanner(System.in);
//        //DO NOT TOUCH BELOW
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String [] word = str.split(",");

        String shortest = "";

        int shor = word[0].length();

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() < shor) {
                shortest += word[i] +", ";

            }
        }
        System.out.println(shortest);





























    }
}
