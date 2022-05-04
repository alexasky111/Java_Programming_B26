package day31_arrays_continue;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
            /*
    given two Strings
    find if they are anagram or not

    the characters are the same in both Strings, but the order is different
     */
        String a = "listen";
        String b = "silent";

        // 1. Create arrays first
        char [] one = a.toCharArray();
        char [] two = b.toCharArray();

        // 2. Sort both of Arrays to have the same format
        Arrays.sort(one);
        Arrays.sort(two);
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        // 3. If arrays equal it is Anagram
        if (Arrays.equals(one,two)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(one,two) ? "Anagram" : "Not Anagram");





    }


}
