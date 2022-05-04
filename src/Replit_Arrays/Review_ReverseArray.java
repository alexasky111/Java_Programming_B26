package Replit_Arrays;

import java.util.Arrays;

public class Review_ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5}; // from the beg to the end and store in the reverse Array
        int [] reverse = new int[arr.length];

        for (int i = arr.length-1, j = 0; i > 0; i--, j++) { //i is FOUR -> j is ZERO
            // You can initialize variable in a loop, we need to store data to reverse into another variable besides i
            System.out.println(arr[i]);
            reverse[j] = arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));


    }
}
