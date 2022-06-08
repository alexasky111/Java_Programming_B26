package interview_tasks.mentor_sessions.part4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task026 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,333,888,90,500));
        System.out.println(removeBigNums(list));

    }
    /*
    26) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */


    public static ArrayList<Integer> removeBigNums(ArrayList<Integer> list){

        list.removeIf(n -> n > 100);

        return list;

    }

}
