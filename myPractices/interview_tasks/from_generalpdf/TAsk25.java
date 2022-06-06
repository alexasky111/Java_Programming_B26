package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TAsk25 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removeBigNums(list1));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 570, 700, 4000, 5, 6, 600, 7, 800, 9, 101, 200, 300));
        System.out.println(removeWithMethodRemove(list));
    }

    public static ArrayList<Integer> removeBigNums(ArrayList<Integer> list) {

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if (it.next() >= 100) {
                it.remove();
            }
            // list.removeIf(each-> each>100);

        }
        return list;
    }

    public static ArrayList<Integer> removeWithMethodRemove(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 100) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
    /*
    //25 USE ITERATOR
ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

output
[1, 2, 3, 4, 5, 6, 7, 8, 9]

     */
}
