package day39_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        /*
        Target word
Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2         */

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("java")){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("=========================================");
    /*
    Four or less
Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
[ tree, loop, cat ]
     */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> characters = new ArrayList<>();
             for (String each : words) {
                 if(each.length() <= 4){
                     characters.add(each);
                 }

                    }
        System.out.println(characters);
        System.out.println("=========================================");
/*
Hide Password
Given an ArrayList of passwords (String). Hide each password in a star
(*) format where each character is a star and print the ArrayList of
hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
 */
        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> charactersNew = new ArrayList<>();


        // To loop through the array list 1st
        for (int i = 0; i < password.size(); i++) {
            String set = "";
        // To loop through each character in the Strings of Array list
            for (int j = 0; j < password.get(i).length(); j++) {
                set += "*"; // now the same amount of * is collected

            }
            password.set(i,set); // to replace all the characters to stars

        }
        System.out.println(password); // to print the password
        System.out.println("=========================================");

        /*
        Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase
characters from a String and store them into separate ArrayLists of
Characters
Ex:
str = “heLLoWoRlD
list1: {h, e, o, o, l}
list2: {L, L, W, R, D}
         */
        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        String str = "(11heLLoWoRlD22)";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upper.add(ch);
            } else if (Character.isLowerCase(ch)){
                lower.add(ch);
            } else if(Character.isDigit(ch)){
                digit.add(ch);
            } else{
                special.add(ch);
            }

        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
        System.out.println(special);

    }

}
