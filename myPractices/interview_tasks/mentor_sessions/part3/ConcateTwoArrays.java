package interview_tasks.mentor_sessions.part3;

import java.util.Arrays;

public class ConcateTwoArrays {
    public static void main(String[] args) {
        int [] arr = {1,11,33,55,66};
        int [] arr1 = {1,2,3};

        System.out.println(Arrays.toString(concatenateArrays(arr,arr1)));
    }

    public static int [] concatenateArrays(int [] arr, int [] arr1){
        int length = arr.length+arr1.length;
        int [] concatenatedArr = new int [length];
        int index = 0;

        for (int i : arr) {
            concatenatedArr[index] = i;
            index++;
        }
        for (int j : arr1) {
            concatenatedArr[index] = j;
            index++;
        }
        return concatenatedArr;
    }
    /*
    Write a return method that can concatenate two arrays
     */

}
