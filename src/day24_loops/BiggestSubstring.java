package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        /*
        Given a String find the biggest substring of chars that match and print
it.
Ex: aaabbbcccccddddee
Output: ccccc
         */

        // 1. iterate a string, go through each char in the loop
        // 2. look for each substring, which is repeating chars
        // Ex: aaa
        // 3. check next character to see if it is a different one
        // 4. check the length -> check if it's the biggest one

        String str = "aaabbbcccccddddee";
        String sub = ""; //bbb
        String biggest = ""; //aaa

        for (int i = 0; i < str.length()-1; i++) { //1.

            sub += str.charAt(i); // 2. checking each iteration for a

            if (str.charAt(i) != str.charAt(i + 1)) { // when the character of i is different from the character next to it (i+1)
                // 3. checking if they are different --> !=

                if (sub.length() > biggest.length()) {
                    biggest = sub; // assigns the substring as the new biggest
                }
                sub = ""; //resets this String for the next substring
            }

        }
        System.out.println(biggest);

    }


}

