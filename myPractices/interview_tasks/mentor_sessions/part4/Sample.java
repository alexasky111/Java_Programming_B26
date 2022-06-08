package interview_tasks.mentor_sessions.part4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(52, 45, 32, 64, 12, 87, 78, 98, 23, 7));

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                int temp = list.get(i);
                list.set(i + 1, list.get(i));
                list.set(i, temp);
                i = -1;
            }


        }

        System.out.println(list);
    }
}
