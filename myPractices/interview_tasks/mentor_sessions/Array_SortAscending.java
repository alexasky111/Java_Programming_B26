package interview_tasks.mentor_sessions;

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortArray(arr)));

        int[] arr1 = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        System.out.println(Arrays.toString(sortArrayWithLoops(arr1)));

    }
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

    public static int[] sortArray(int[] arr) {
        System.out.println("Original Array: "+Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1; //to reset the index value
            }
        }
        return arr;
    }

    public static int[] sortArrayWithLoops(int[] arr) {

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
