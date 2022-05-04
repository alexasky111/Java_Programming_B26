package day32_multidimentional_arrays;

import java.util.Arrays;

public class AverageOfEach_TraditionalLoop {
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

        // 2. Loop through the 2D Array - "nums" one index/element/array at a time
        for (int i = 0; i< nums.length; i++) {
            //System.out.println(Arrays.toString(eachArray));

            double sum = 0; // --> the count needs to be reset to start adding new array every time to find separate average numbers of arrays

        // 3. To go through each single Array in a 2D Array
            for (int j = 0; j < nums[i].length; j++) { // based on the length of 4 or 3 or 3
                sum += nums[i][j]; // explanation -->
        /*
                int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

            int i = 0

                int j = 0
                nums[i][j]
                nums[0][0] --> 3
                j = 1
                nums[0][1] --> 4
                j = 2
                nums[0][2] --> 5
                j = 3
                nums[0][3] --> 6

               i = 1

                int j = 0
                nums[i][j]
                nums[1][0] --> 5
                j = 1
                nums[1][1] --> 2
                j = 2
                nums[1][2] --> 6


        etc...

         */
            }
            System.out.println(Arrays.toString(nums[i])+" the average is "+(sum/nums[i].length)); // (sum/eachArray.length) --> Average formula of each Array
            total += sum; // it'll take the results of the additions and store them in "total"
            totalLength += nums[i].length;
        }

        System.out.println("Average of the whole 2D Array: "+ (total/totalLength));












    }
}
