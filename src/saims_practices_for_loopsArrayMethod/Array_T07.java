package saims_practices_for_loopsArrayMethod;

public class Array_T07 {
    public static void main(String[] args) {
        /*Shortest and Longest words from String array
•Write a program that can return the shortest string element from a
String array
•Write a program that can return the longest string element from a
String array
         */
        String[] words = {"apple, cat, pineapple"};
        String shortest = words[0];
        String longest = words[0];

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() < shortest.length()) {

                shortest = words[i];
            }
            if (words[i].length() > longest.length()) {

                longest = words[i];
            }

        }

        System.out.println("Longest word is "+longest);
        System.out.println("Shortest word is "+shortest);

    }
}