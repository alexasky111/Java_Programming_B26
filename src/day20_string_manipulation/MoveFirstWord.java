package day20_string_manipulation;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
Input: Java is a fun language
Output: is a fun language Java
Hint: Use indexOf and substring
 */
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine().trim(); // to avoid extra space

        int spaceIndex = sentence.indexOf(' ');

        String firstWord = sentence.substring(0, spaceIndex); // if I include +1 I'd be keeping extra space

        String result = sentence.substring(spaceIndex+1)+" "+ firstWord;

        //String result = sentence.substring(spaceIndex).trim()+" "+ firstWord;

        System.out.println(result);








    }
}
