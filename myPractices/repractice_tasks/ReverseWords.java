package repractice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    /*
    3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
// revWords("apple banana kiwi") -> "kiwi banana apple"
  // revWords("I am John Doe")     -> "Doe John am I"
  // revWords("orange")            -> "orange"
     */

    public static String reversedWordOrder(String str){
        String [] arr = str.split(" ");
        String [] reversedArr = new String [arr.length];

        for (int i = arr.length-1; i >=0; i--) {
            reversedArr[(reversedArr.length-1)-i] = arr[i];
        }
        return Arrays.toString(reversedArr);
    }


}
