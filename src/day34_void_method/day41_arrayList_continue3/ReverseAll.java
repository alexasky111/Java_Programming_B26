package day34_void_method.day41_arrayList_continue3;

import day40_arrayList_continue2.ArrayListWithMethods;
import my_Utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        /*
        Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));

        //Calling the method from day 40(ArrayList) that was already instead of doing manually and reversing
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        ArrayList<String> reverseWords = new ArrayList<>();
        for (String s : list) {
            // To call the reverse method un StrinUtil class to reverse each word, each element, then we are adding the reversed word into the 'reverseWords' ArrayList
            reverseWords.add(StringUtil.reverse(s));
        }
        return reverseWords;
    }
}
