package day39_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class CovertArrayToList {

    public static void main(String[] args) {
        // 1. To make an Integer Array bc Array List doesn't accept primitive types
        Integer [] arr = {1,2,3};

        // To convert an Array to a collection type (ArrayList)
        Arrays.asList(arr);

        //To create an ArrayList with values from a collection type
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

        // To create an ArrayList w/ some initial values | This is the way we will use
        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println(other);
        /*
        Arrays.asList(4,5,6,7)
        [4,5,6,7] --> converts it to ArrayList
         */
    }
}
