package day32_multidimentional_arrays;

import java.util.Arrays;

public class MultiArray_ex {
    public static void main(String[] args) {
   int [] n = {5,10,20,10};
   int [] m = {5,10,100,39,19};

   // 1. To make Multidimensional Array
   int [][] all = {n, m};
   System.out.println(Arrays.toString(all)); // -> not valid printing

   // 2. To print whole Multidimensional Array
   System.out.println(Arrays.deepToString(all));

   // 3. To print the 1st and 2nd single dimensional array in a multidimensional array separately
        System.out.println("First array: "+ Arrays.toString(all[0]));
        System.out.println("Second Array: "+ Arrays.toString(all[1]));
        System.out.println();


        int[][] multi = {
                {90,80,70}, // index 0 array --> size 3
                {19,51,1129,12}, // index 1 array  --> size 4
                {10,1900}, // index 2 array  --> size 2
                {14} // index 3 array --> size 1
        };

        // To see the size of multidimensional is 4
        System.out.println(multi.length);

        // To see the size of the first element of multidimensional array
        System.out.println(multi[0].length);

        // To see the value of the 2nd element of the 1st element of multidimensional array
        System.out.println(multi[0][1]); // --> access the 1st array first and then an element in that array

        // To see the size of the 4th array in multidimensional array
        System.out.println(multi[3].length);





    }
}
