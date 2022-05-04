package day39_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        /*
        Write a program that can extract the special characters, digits and letters
from a string and stores them into separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
        // 1. To go through each character first
            char ch = str.charAt(i);
            // 2. To use Wrapper class object method Character
            if(Character.isUpperCase(ch)){
                upper.add(ch);
            } else if (Character.isDigit(ch)) {
                digit.add(ch);
            }else{
                special.add(ch);
            }

        }
        System.out.println("list1:" + upper);
        System.out.println("list2:" + digit);
        System.out.println("list3:" + special);

        /*
        Given an ArrayList of words switch position for
each pair in the List. A pair is an element and
the element next to it.
The given ArrayList will always have an even
number of elements so each element will
always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
"the" and "hat"
Output: {"in", "Cat", "hat",
"the”}
         */
        ArrayList<String> original = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        ArrayList<String> paired = new ArrayList<>();
        // 1. To start off the Loop i --> going from "in" than j --> going from "Cat" ==> both adding to the new ArrayList, next iteration i --> going 1 +=2 to "hat" and j --> going 0 +=2 to "the" ==> adding to the new ArrayList
        for (int i = 1, j=0; i < original.size(); i +=2, j +=2) {
            paired.add(original.get(i));
            paired.add(original.get(j));
        }
        System.out.println(paired);





    }
}
