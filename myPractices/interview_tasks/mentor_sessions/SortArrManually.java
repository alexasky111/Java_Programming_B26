package interview_tasks.mentor_sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrManually {
    public static void main(String[] args) {
        int arr[] = {10, 9, 5, 7, 6, 4, 3, 2, 0, 1, 8};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 5, 7, 6, 4, 3, 2, 0, 1, 8));
        int temp1 = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                temp1 = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp1);
                i = -1;
            }


        }

        System.out.println(list);
    }
    /*
    Sort an array or ArrayList yourself. Not using provided sort methods.
    I will share solution of this soon
     */

}
