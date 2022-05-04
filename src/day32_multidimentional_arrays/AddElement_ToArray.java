package day32_multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement_ToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask how many numbers to start with
        System.out.println("How many nums do you want to start w/");
        int size = input.nextInt();
        int [] nums = new int [size];

         // 2. The purpose of the Loop is to get all the numbers for the Array
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number: ");
            nums[i] = input.nextInt();

        }
        // 3. To create a new Array --> expanded w/ +1 element using the copyOf() method and the values of nums Array
        System.out.println("Array so far: "+Arrays.toString(nums));
        int [] expanded = Arrays.copyOf(nums, nums.length + 1); // can't do nums[4]
        System.out.println("Enter the last number: ");
        expanded[expanded.length-1] = input.nextInt();

        // 4. To print the final version
        System.out.println(Arrays.toString(expanded));
    }
}
