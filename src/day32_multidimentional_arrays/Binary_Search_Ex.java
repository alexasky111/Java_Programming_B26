package day32_multidimentional_arrays;

import java.util.Arrays;

public class Binary_Search_Ex {
    public static void main(String[] args) {
        // 1. To make a sorted Array (smallest to largest)
        int [] nums = {4,10,30,100};

        // 2. Returns 0, because number 4 is in the position 0 of the Array
        System.out.println(Arrays.binarySearch(nums,4));

        // 3. Returns 3, because number 100 is in the position 3 of the Array
        System.out.println(Arrays.binarySearch(nums,100));

        // 4. Returns -5; would be in position 4, so 4+1 = 5 and negative because it was in the Array, so -5
        System.out.println(Arrays.binarySearch(nums, 200));

        // if we had num 6 it would be btw 4 and 10 in position 1 than +1 ==> 1+(+1) = 2 and make it negative
        System.out.println(Arrays.binarySearch(nums, 6)); // -2
        System.out.println(Arrays.binarySearch(nums, 5)); // -2





    }
}
