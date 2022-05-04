package day35_return_method;

import java.util.Arrays;

public class MinNumInArray {
    /*
    create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber (int [] nums) {

        // 1. to have a value to compare with we start with 1st element in the Array
        int min = nums[0];

        for (int num : nums){
        // every element of the array is num if it's less than the min it'll be reassigned
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static int minNumberSort(int [] nums){
        // Can do it this way, in a sorted Array the smallest will be the 1st num
        Arrays.sort(nums);
        return nums[0];
    }
}
