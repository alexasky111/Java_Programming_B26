package recap_ofday09;

import java.util.Arrays;

public class RotatedLeft {
    public static void main(String[] args) {
        /*
        Task 02 : Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]

         */
//        int [] arr = {17,12,10,8};
//        int [] rotated = new int [arr.length];
//
//        for (int i = 0; i < arr.length-1; i++) {
//            rotated[i] += arr[i+1];
//            rotated[arr.length-1] = arr[0];
//        }
//        System.out.println(Arrays.toString(rotated));
        int [] arr = {17,12,10,8};
        int temp = arr[0];

    // 1. To loop through the numbers
        for (int i = 0; i < arr.length-1; i++) {

    // 2. We must start with the index 1 to follow requirements
            arr[i] = arr[i+1];
        }
    // 3. To avoid the same 1st and last characters, and not to lose the initial 1st character, we created the int variable to assign the 1st character of the Array to the last, since it is Left side Rotation
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));

   // Do it for Rotated Right int[] x = {1,2,3,4,5}; [5,1,2,3,4]


        for (int i = arr.length-1; i > 0; i--) {
            arr[i] += arr[i];
        }
//        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));


    }
}
