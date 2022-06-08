package day08_06_2022;

import java.util.Arrays;

public class P01_ProductOfElements {
    /*
     Task 01;
     Write a function that takes in a non-empty array of integers and returns an array of the same length, where each element in the output array is equal to the product of every other number in the input array. In other words, the value at output[i] is equal to the product of every number in the input array other than input[i] .
     Note that you're expected to solve this problem without using division.
                Sample Input array = [5, 1, 4, 2]
                Sample Output [8, 40, 10, 20]
                     // 8 is equal to 1 x 4 x 2
                     // 40 is equal to 5 x 4 x 2
                     // 10 is equal to 5 x 1 x 2
                     // 20 is equal to 5 x 1 x 4
     */
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2};
        System.out.println(Arrays.toString(product(nums)));
    }
    public static int[] product(int[] nums){
        int[] product = new int[nums.length];

        if(nums.length==0){
            System.out.println("invalid Array");
            return product;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    num *= nums[i];
                }
            }
            product[i] = num;
        }
        return product;
    }
}
