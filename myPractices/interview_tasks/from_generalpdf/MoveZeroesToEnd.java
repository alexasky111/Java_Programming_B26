package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {

    /*
      int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
      ArrayList<Integer> list = new ArrayList<>();
output
[1, 2, 3, 49, 6, 5, 0, 0, 0]
     */
    public static void main(String[] args) {
        Integer [] arr = {1, 0,0,2,0, 3, 49, 6, 5};

        System.out.println(moveZeroes(arr));
    }
    public static ArrayList<Integer> moveZeroes(Integer [] arr) {

        //Integer [] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

//        System.out.println(list);
        ArrayList<Integer> forZeroes = new ArrayList<>();
        for (Integer each : list) {

            if (each == 0) {
                forZeroes.add(0);
            }
        }
        list.removeIf(each -> each == 0);
        list.addAll(forZeroes);
        System.out.println(list);


        return list;


    }
}
