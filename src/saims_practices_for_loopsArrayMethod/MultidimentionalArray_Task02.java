package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;

public class MultidimentionalArray_Task02 {
    public static void main(String[] args) {
        /*
        Given two 2D arrays multiply them together and store the results into a
new 2D array. Multiple each number in each position as its own calculation
Ex:
{1, 2, 3}
{2, 5, 10}
{0, 3, 20}
x
{10, 4, 3}
{5, 2, 7}
{100, 20, 5}
Output:
{10, 8, 9}
{10, 10, 70}
{0, 60, 100}
         */

        // 1. To create 1st 2D Array
        int [][] arr1 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20},
        };

        // 2. To create 2nd 2D Array
        int [][] arr2 = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5},
        };

        // 3. To create 3rd 2D Array - a container where we will be adding the multiplications
        int [][] arrMain = new int [3][3];

        // 4. To loop through the 1st 2D Array i --> goes through element 0, 1, 2 by rows; j ---> goes through elements by dots each position one at a time
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

        // 5. To assign values to the new arrMain Array
        arrMain[i][j] = arr1[i][j] * arr2[i][j];

            }
        }
        // 6. To print New arrMain - 2D dimensional Array
        System.out.println(Arrays.deepToString(arrMain));



















    }
}
