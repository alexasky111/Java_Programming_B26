package day28_arrays_intro;

import java.util.Arrays;

public class ArraysIntro2 {
    public static void main(String[] args) {
        double [] arr = new double[4]; // the size of the array is fixed you can't add to the array
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99; // zero of my array I want to store the value || assigning to it
        System.out.println(Arrays.toString(arr));
        arr [1] = 12.55;
        arr [2] = 10.20;
        arr [3] = 5;
        System.out.println(Arrays.toString(arr));
        arr [2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5]; // creates a new Array w/ 5 elements and reassigns the arr reference to the new object || ALL THE DATA BEFORE IS GONE
        System.out.println(Arrays.toString(arr)); // ALL the elements will be = 0.0
        System.out.println(arr[1]);







    }
}
