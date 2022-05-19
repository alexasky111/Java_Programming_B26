package interview_tasks.mentor_sessions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrMoveZeroesToEnd {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveAllZeros(arr)));
    }

    public static int[] moveAllZeros(int[] arr) {

        int [] fixed = new int[arr.length];
        int index = 0; //to start a new arr at the index position of 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                fixed[index] = arr[i];
                index++;
            }
        }
        return fixed;

    }
/*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */

}
