package Interview_Questions;

public class Longest_palindrome_QI {
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

    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        // outer loop is iterating through an Array
        for (String eachWord : words) // words[i] == eachWord
        {
            boolean isPalindrome = true; //when characters are not equal than I do an action
            //System.out.println(eachWord);


        // inner loop is iterating through each String element
            for (int i = 0; i < eachWord.length()/2; i++) {

                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) { // CAN be done w/ another variable in the loop that decrements
                    isPalindrome = false;
                    break;

                }

            }
            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }


        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

        /*
            if(longestPalindrome.isEmpty()){
                System.out.println("No Palindrome");
             } else {
                System.out.println(longestPalindrome);
              }

         */

    }
        /*

        civic

        eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i

        int i = 0
            eachWord.charAt(0) != eachWord.charAt(5 - 1 - 0) --> charAt(4)
                c       !=     c

         i = 1
            eachWord.charAt(1) != eachWord.charAt(5 - 1 - 1) --> charAt(3)
                i       !=     i
     */
}