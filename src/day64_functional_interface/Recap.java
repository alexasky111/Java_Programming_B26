package day64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    /*
    1.1 Create a function that can verify if a number contains duplicate digits
     */
    public static void main(String[] args) {
        Predicate<Integer> verifyDuplicates = (n) -> {

            String str = Integer.toString(n);
            String uniques = "";

            for (int i = 0; i < str.length(); i++) {
                if(!uniques.contains(str.charAt(i)+"")){
                    uniques += str.charAt(i);
                }else{
                    return true; //if unique String has the num already, it means we have found it sometime bf in the num already, which means the digit is duplicate
                }
            }
            return false; //all nums were unique, so else statement of the if was never run which means no duplicates

        };
        System.out.println(verifyDuplicates.test(123));
        System.out.println(verifyDuplicates.test(1122));

        /*
        1.3 Create a function that can return the longest String from a List of String
         */
        Function<List<String>, String> returnLongestStr = (list) -> {
            String longest = "";

            for(String s: list){
                if(s.length()>longest.length()){
                    longest = s;
                }
            }
            return longest;

        };
        System.out.println(returnLongestStr.apply(new ArrayList<>(Arrays.asList("java","car","cat","bokcase","python"))));
        //the apply method accepts a List as the argument because the reference of longestStringFromList accepts the List type, and it returns String
    }

}
