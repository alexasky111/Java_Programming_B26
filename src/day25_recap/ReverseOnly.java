package day25_recap;

import java.util.Scanner;

public class ReverseOnly {
    public static void main(String[] args) {
        /*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java
	Ouput:
	I evol java
         */

Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String str = in.nextLine().trim(); // -> very useful when we work w/ spaces

  // indexOf is ALWAYS assigned as an INT, spaces are always going to be different, so we can't use indexes of the characters w/ charAt

        int firstSpace = str.indexOf(" "); // 1. the first occurrence of a " " character

        int lastSpace = str.lastIndexOf(" "); // 2. str.indexOf(" ", firstSpace + 1); -> to find the 2nd space, starting from the character right after the 1st space;

        String middleWord = str.substring(firstSpace + 1, lastSpace); // 3. To Pull Out the word from the string (the 2nd number -> space is not included, so it'll stop on the letter)
        String reverse = "";
        for ( int i = middleWord.length()-1; i >= 0; i--) // 4. To reverse your the string you start from the end (start from last position -> backwards)
        {  reverse += middleWord.charAt(i);  // 5. it will give a word character by character concatinating all characters together in a string => word

        }

            System.out.println(str.substring(0,firstSpace+1) + reverse + str.substring(lastSpace)); // 6. How to get everything back -> start from zero index=1st letter to the space+1, so the space is included


        // str = str.replace (middleWord, reverse);
        // System.out.println(str);



    }














//        String sentence = "I love java";
//         String str = "love", inverse = "";
//            char ch;
//     for (int i = 0; i < str.length(); i++)
//                {
//                    ch = str.charAt(i);
//
//                    inverse = ch + inverse;
//                }
//                System.out.println(sentence.replace("love", inverse));




}
