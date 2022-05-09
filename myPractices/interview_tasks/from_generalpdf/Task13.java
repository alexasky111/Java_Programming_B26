package interview_tasks.from_generalpdf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(mergeTwoArraysTwo(arr1,arr2)));
    }
    /*
    //13
 int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        output
     [1, 2, 3, 4, 5, 6, 7]
     */
    public static ArrayList<Integer> mergeTwoArrays(int[] arrOne, int[] arrTwo) {
        //to create a new non-primitive arr w/ length of primitive
        Integer[] arrIntegerOne = new Integer[arrOne.length];

        // where->how replacing the values from
        Arrays.setAll(arrIntegerOne, i -> arrOne[i]);

        Integer[] arrIntegerTwo = new Integer[arrTwo.length];
        Arrays.setAll(arrIntegerTwo, i -> arrIntegerTwo[i]);

        ArrayList<Integer> mergedArrayList = new ArrayList<>();
        mergedArrayList.addAll(Arrays.asList(arrIntegerOne));
        mergedArrayList.addAll(Arrays.asList(arrIntegerOne));
        mergedArrayList.addAll(Arrays.asList(arrIntegerTwo));

        return mergedArrayList;
    }

    public static int[] mergeTwoArraysTwo(int[] arrOne, int[] arrTwo) {

        int[] mergedArr = new int[arrOne.length + arrTwo.length];

        for (int i = 0; i < arrOne.length; i++) {
            mergedArr[i] = arrOne[i];
        }


        for (int i = arrOne.length; i < mergedArr.length; i++) {
            mergedArr[i] = arrTwo[i - arrOne.length];
        }

        return  mergedArr;

    }
}
