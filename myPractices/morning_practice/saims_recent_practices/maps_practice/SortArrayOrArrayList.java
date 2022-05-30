package morning_practice.saims_recent_practices.maps_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayOrArrayList {

    public static void main(String[] args) {
        int [] arr = {10,6,9,22,33,1};

        System.out.println(Arrays.toString(sortArr(arr)));

    }
    public static int [] sortArr(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr;

    }
    /*
    Sort an array or ArrayList yourself. Not using provided sort methods.
     */
}
