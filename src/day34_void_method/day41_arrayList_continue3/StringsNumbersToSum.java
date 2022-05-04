package day34_void_method.day41_arrayList_continue3;

import java.util.ArrayList;
import java.util.Arrays;

public class StringsNumbersToSum {
    public static void main(String[] args) {
        /*
        String numbers to sum
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","34","513"));
        System.out.println(sumFromString(list));

    }

    public static ArrayList<Integer> sumFromString(ArrayList<String> list) {
        //1. To make the new array list that i will end up returning
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list) {
            //1. MUST put int btw the loops, bc the number always needs to reset
            int currentSum = 0;

            //2. Converts a String 'each' into a String array by splitting, and then using as Array I'm iterating through // "123" --> ["1", "2", "3" and then you loop through that array
            for (String eachDigit : each.split("")) {
                currentSum += Integer.parseInt(eachDigit);
            }
            sums.add(currentSum);
        }
        return sums;
    }
}
