package day11_03_22_2022;

import java.util.Arrays;

public class Methods_Tasl03_MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 11, 9, 10};

        mergeToArray(arr1, arr2);
    }

    public static void mergeToArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i] = each; // or arr3[i++]
            i++;
        }
        for (int each : arr2) {
            arr3[i++] = each;

        }
        Arrays.sort(arr3); // To sort our new Array bc of number 11
        System.out.println(Arrays.toString(arr3));
    }
}
