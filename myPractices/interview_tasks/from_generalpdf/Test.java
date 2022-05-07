package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
    }
}
