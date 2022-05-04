package day34_void_method.day41_arrayList_continue3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {
          /*
    Create a method that will accept an Integer ArrayList and check for
bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then
the
second number. Remove any bad pairs for the ArrayList and return
the
ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of
elements, so each number always has one pair
@param nums - Given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {3, 4, 6, 1, 1, 10, 8, 7};
Output: {3, 4, 1, 10};
Bad pairs that were removed:
6, 1
8, 7
     */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));

        System.out.println(removeBadPairs(nums));
    }
    public static ArrayList<Integer> removeBadPairs (ArrayList<Integer> list){
        //1. Will store all pairs here
        ArrayList<Integer> goodPairs = new ArrayList<>();
        //2. The reason Im doing +=2 bc I need to check each 2 numbers(pairs)
        for (int i = 0; i < list.size(); i+=2) {
            //3. To add if 1st element in a pair is smaller than 2nd element in the pair
            if(list.get(i)<list.get(i+1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i+1));
            }
        }
        return goodPairs;
    }
}
