package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;

public class Task40 {
    /*
//40  FIND missing number
 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
     */

    public static void main(String[] args) {

        int r[] = {-1, 3, 5, 6, 7, 9, 13, 18, 70, 80, 1400, 1401, 1405};
        System.out.println(findMissingNums(r));


    }

    public static ArrayList<Integer> findMissingNums(int[] arr) {

        Arrays.sort(arr);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int j : arr) {
            list1.add(j);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
            if (!list1.contains(i)) {
                list.add(i);
            }
        }
        return list;

    }


}
