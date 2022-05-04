package day34_void_method.day41_arrayList_continue3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
            /*
    Remove Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”} Max number: 4
Output: {“three, “four”, “five”
     */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","two","three","four","five"));
        System.out.println(keepLongString(words,4));

    }
    public static ArrayList<String> keepLongString(ArrayList<String> list, int maxLength){
        list.removeIf(word -> word.length()<maxLength);
        return list;
    }
}
