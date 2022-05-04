package day29_arrays;

public class Array2_T05 {
    public static void main(String[] args) {
        /*
        [IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String reverse = "";
        String longestPalindrome = "";
        boolean hasPalindrome = false;

        for (int i = 0; i < words.length; i++) {
            reverse = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);

                if (reverse.equalsIgnoreCase(words[i])) {
                    longestPalindrome = reverse;
                    hasPalindrome = true;
                }
                if (reverse.length() > longestPalindrome.length()) {
                    longestPalindrome = reverse;
                }
            }
            System.out.println(longestPalindrome);
            System.out.println(reverse);

        }

    }

//        if(hasPalindrome)
//
//    {
//        System.out.println("The longest palindrome is " + longestPalindrome);
//    } else
//
//    {
//        System.out.println("No Palindrome!");
    }






