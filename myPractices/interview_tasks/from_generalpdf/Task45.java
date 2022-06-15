package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task45 {
    /*
    //45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));
     */
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple"));

        System.out.println(longestRepetitive(fruits));

    }
    public static String longestRepetitive(ArrayList<String> list) {

        Map<String, Integer> mapRes = new HashMap<>();
        int count = 0;
        String res = "";
        int max = 0;

        for (String each : list) {
            if (mapRes.containsKey(each)) {
                count = mapRes.get(each) + 1;
                mapRes.put(each, count);
            } else {
                mapRes.put(each, 1);
            }
        }

        for (String each : mapRes.keySet()) {
            if(mapRes.get(each) > max){
                max = mapRes.get(each);
                res = each;
            }
        }

        return res;
    }

}
