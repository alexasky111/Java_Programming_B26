package interview_tasks.mentor_sessions.part4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task027 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(21,1,2,6,8,32));
        System.out.println(sortInAscending(list));
    }
    /*
    27) ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
     */

    public static ArrayList<Integer> sortInAscending(ArrayList<Integer> list) {
// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(52, 45, 32, 64, 12, 87, 78, 98, 23, 7));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }

        return list;
    }
}
