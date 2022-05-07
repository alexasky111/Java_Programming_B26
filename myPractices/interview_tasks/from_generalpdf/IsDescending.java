package interview_tasks.from_generalpdf;

import java.util.Arrays;
import java.util.Objects;

public class IsDescending {
    /* 11  if disc  true
    int[]a={7,6,5,4};
    */


    public static void main(String[] args) {
        int [] arr = {0,4,3,2,1};
        System.out.println(isDesc(arr));

    }

   public static boolean isDesc(int [] a){

       int min = Integer.MAX_VALUE;
        boolean b1 = true;
       for(int i=0;i<a.length;i++){
           if(a[i]<min){

              return b1;
           }
       }
       return !b1;
    }
}
