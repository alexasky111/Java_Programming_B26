package day11_03_22_2022;

import java.util.Arrays;

public class Method_Intro {
    /*
    Task 1 :    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
     */
    public static void stringTimes(String str, int times){
        if(times>0){
            for (int i = 0; i < times; i++) {
                System.out.print(str);
            }

        }else{
            System.err.println("The num has to be >0 ");
        }
    }
    /*
    Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */
    public static void combinedArr(int [] arr, int [] arr1){
        String combined = "";
        for (int i = 0; i < arr.length; i++) {
            combined += arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            combined += arr1[i];
        }
        String [] res = combined.split("");
//        char [] res = combined.toCharArray();
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        stringTimes("Ukraine",-1);

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,9,10};
        combinedArr(array1, array2);
    }
}
