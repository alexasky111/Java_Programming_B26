package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;

public class Array_T05 {
    public static void main(String[] args) {
        /*
        Move Zeros
Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
Ex:
Input:
[10, 0, 5, 0, 1, 0]
Output:
[10, 5, 1, 0, 0, 0]
         */
        int[] numbers = {10, 0, 5, 0, 1, 0};
        int[] result = new int[numbers.length]; //the length of the 2nd array
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {
                result[count] = numbers[i];
                count++;

            }
        }

        System.out.println(Arrays.toString(result));

    }

}
