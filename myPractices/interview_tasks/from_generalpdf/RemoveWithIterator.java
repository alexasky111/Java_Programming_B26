package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWithIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 6, 333, 4, 2, 888, 7, 99, 9, 101, 200, 300));

        System.out.println(removeWithIterator(list1));

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 10) {
                list1.remove(list1.get(i));
            }
        }
        System.out.println(list1);

    }

    public static ArrayList<Integer> removeWithIterator(ArrayList<Integer> list) {

        list.removeIf(integer -> integer > 10);

        return list;


    }
    /*
    USE ITERATOR
ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

output
[1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

}
