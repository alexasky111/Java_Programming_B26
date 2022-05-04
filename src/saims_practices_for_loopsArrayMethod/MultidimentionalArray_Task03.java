package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;

public class MultidimentionalArray_Task03 {
    public static void main(String[] args) {
        /*
        Create an empty 2D array with size 10 and each inner array with size 10.
Fill the elements of the 2D array with numbers from 1 - 100 where each
array starts from the number after the last number in the previous array.
The goal is to print the numbers of 1-10, 11- 20, 21-30, etc.. until the
end on separate lines
Ex:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
11, 12, 13, 14, 15, 16, 17, 18, 19, 20
21, 22, 23, 24, 25, 26, 27, 28, 29, 30
etc
         */
        int[][] arrMain = new int[10][10];
        int a = 1;

        // To loop through the rows i = 0 --->row 0 = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, row 1 = 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        for (int i = 0; i < arrMain.length; i++) {

        // To loop through each position in a row 0, row 1, row 2
            for (int j = 0; j < arrMain[i].length; j++) {

        // To fill up each position in a row 0, 1, 2 w/ numbers w/ a help of post incrementing the variable "a"
                arrMain[i][j] = a++;

            }
            System.out.println(Arrays.toString(arrMain[i]));

        }


    }
}