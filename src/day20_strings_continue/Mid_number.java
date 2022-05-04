package day20_strings_continue;

public class Mid_number {
    /*
    [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the
string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph

     */

    public static void main(String[] args) {

        String word = "elephant";

        int length = word.length();
        int mid = length/2;

        word = (length%2==0) ? (""+word.charAt(mid-1) + word.charAt(mid)) : (""+word.charAt(mid));
        System.out.println(word);




    }
}
