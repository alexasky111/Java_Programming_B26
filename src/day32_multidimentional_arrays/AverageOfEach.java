package day32_multidimentional_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

            /*
    Given a 2D array find the average of each inner array
    and extra: average of the whole array
    Ex:
        3, 4, 5, 6
        5, 2, 6
        10, 20, 30
     */

        // 1. Declare and assign 2D int Array
        int [][] nums = {
                { 3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        // 4. To make a variable that will calculate the Average Number of the whole 2D Array
        double total = 0;
        int totalLength = 0;

        // 2. Loop through the 2D Array - "nums"
        for (int[] eachArray : nums) {
        //System.out.println(Arrays.toString(eachArray));

            double sum = 0; // --> the count needs to be reset to start adding new array every time to find separate average numbers of arrays

        // 3. To go through each single Array in a 2D Array
            for (int eachNumber : eachArray) {
               sum += eachNumber;
            }
            System.out.println(Arrays.toString(eachArray)+" the average is "+(sum/eachArray.length)); // (sum/eachArray.length) --> Average formula of each Array
            total += sum; // it'll take the results of the additions and store them in "total"
            totalLength += eachArray.length;
        }

        System.out.println("Average of the whole 2D Array: "+ (total/totalLength));












    }
}
