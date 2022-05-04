package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {
        /*
    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

               ----> Methods that belong to Wrapper Character Class <------
    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number
     */
        public static void main(String[] args) {
            String str = "aP3d572&*jd@jdJU";
            String uppercaseChars = "";
            int upper = 0, lower = 0, number = 0, other = 0;
            // 1. To iterate through the string one element at a time
            for (int i = 0; i < str.length(); i++) {

            // 2. To call it one time instead of writing 3 times
                char letter = str.charAt(i);
                if(Character.isUpperCase(letter)){
                    upper++;
                    uppercaseChars += letter;

                } else if(Character.isLowerCase(letter)){
                    lower++;
                } else if (Character.isDigit(letter)){
                    number++;
                }else {
                    other++;
                }

            }
            System.out.println("Upper: "+upper);
            System.out.println("Uppercase letters: "+ Arrays.toString(uppercaseChars.toCharArray()));// To print all upper case chars in the Array not in the String
            System.out.println("Lower: "+lower);
            System.out.println("Nums: "+number);
            System.out.println("Other: "+other);
        }


}
