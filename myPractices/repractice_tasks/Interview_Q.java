package repractice_tasks;

import java.util.ArrayList;

public class Interview_Q {

    public static ArrayList<String> trimArrayList(ArrayList<String> list) {
        ArrayList<String> trimmedList = new ArrayList<>();

        if (!list.isEmpty() && list != null) {

            for (String each : list) {
                trimmedList.add(each.trim());
            }
        }
        return trimmedList;
    }
}
