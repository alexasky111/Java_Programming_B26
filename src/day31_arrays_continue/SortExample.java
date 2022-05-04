package day31_arrays_continue;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        // 1. Array is mutable(changeable), the size can't be changed
        int [] nums = {3,6,2,68,-2,24};

        int [] notSorted = nums; // Doesn't make new array object


        // 2. We used the method sort() without reassigning, the method doesn't have a return
        Arrays.sort(nums); // --> Sorting action, is not meant to give any value back (if you sorted it, there is no way to get the initial one)
        System.out.println(Arrays.toString(nums)); // --> Printing

        // Q: Max and Min from Array
        System.out.println("Min: "+ nums[0]);
        System.out.println("Max: "+ nums[nums.length - 1]);










    }
}
