package interview_tasks.mentor_sessions.part4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task028 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(52, 45, 32, 64, 12, 87, 78, 98, 23, 7));
        System.out.println(sortInDescending(list));
    }
    /*
    28) ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
     */
    public static ArrayList<Integer> sortInDescending(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }

        return list;
    }
}
