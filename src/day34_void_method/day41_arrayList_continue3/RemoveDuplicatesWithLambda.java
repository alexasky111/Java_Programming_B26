package day34_void_method.day41_arrayList_continue3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesWithLambda {
       /*
    Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers @return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9}; Output: {3, 4, 9};
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers){
        // I remove the num if the frequency of it is > 1
        // Starts w/ 1 how many 1 is in the ArrayList, if frequency 2 is more than 1->true mean we remove it
        numbers.removeIf(num -> Collections.frequency(numbers, num)>1);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));
    }
}
