package repractice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task01 {
    /*
    Remove duplicates from a string. Write a method that accepts one string argument and returns it without duplicates. We will see two versions of this method.
     */
// removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"

    public static void main(String[] args) {
        String str = "aapple";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(str.split("")));
        String res = "";

        for (String each : arrList) {

            if(!res.contains(each)){
                res += each;
            }

        }
        return res;

    }

}
