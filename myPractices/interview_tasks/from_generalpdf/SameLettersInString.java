package interview_tasks.from_generalpdf;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLettersInString {
    /*
    use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {
        String g="abc";
        String h="cab";
        System.out.println(containsDuplicates(g, h));
    }

    public static boolean containsDuplicates(String str, String str2) {

        String[] arr = str.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);
    }
}
