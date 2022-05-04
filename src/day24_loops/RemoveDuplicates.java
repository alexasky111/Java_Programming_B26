package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
/*
Write a program that can remove duplicates from a String
Ex:
Input: abcabc
Output: ab

Remove duplicates by NOT adding them to a string
 */
        String s = "abcabc";
        String unique = ""; // where we will store the result

        for (int i = 0; i < s.length(); i++){
            if(!unique.contains(""+s.charAt(i))) { // if my string contains my character I don't need to do anything --> I need it to not contain

                unique += s.charAt(i); // it is the main code I want to add character to the string. I want to add if I hadn't added it before
            }
        }
        System.out.println(unique);


    }
}
