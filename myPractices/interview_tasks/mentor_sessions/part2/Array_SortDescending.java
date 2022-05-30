package interview_tasks.mentor_sessions.part2;

import java.util.Arrays;

public class Array_SortDescending {
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDescendingWithLoop(arr)));

        int [] arr1 = {10,20,7, 8, 90,100,93,66,0};
        //i=-1;        20 10 7 8 90 100 66 93 0
        System.out.println(Arrays.toString(sortDescending(arr1)));

    }
    /*
12) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static int [] sortDescendingWithLoop(int [] arr){
        System.out.println("Original arr: "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int [] sortDescending(int [] arr){
        System.out.println("Original arr: "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        return arr;
    }
}
