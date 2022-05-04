package interview_tasks;

import java.util.Arrays;
import java.util.Objects;

public class IsDescending {
    /* 11  if disc  true
    int[]a={7,6,5,4};
    */


    public static void main(String[] args) {
        int [] arr = {4,4,3,2,1};
        System.out.println(isDesc(arr));
    }

   public static boolean isDesc(int [] arr){

        int [] arrToCompare = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrToCompare);

        int [] arrToAdd = new int[arrToCompare.length];

        for (int i = arr.length-1; i >=0; i--) {
            arrToAdd[arrToCompare.length-1-i] = arrToCompare[i];
        }
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arrToAdd));
       return Arrays.equals(arr,arrToAdd);
    }
}
