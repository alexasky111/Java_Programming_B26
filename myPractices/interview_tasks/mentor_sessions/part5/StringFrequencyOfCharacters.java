package interview_tasks.mentor_sessions.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {
    /*
    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {
        String res = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String each : list) {
            if (map.containsKey(each)) {
                count = map.get(each) + 1;
                map.put(each, count);
            } else {
                map.put(each, 1);
            }
        }

        for (String key : map.keySet()) {
            res += (key + "" + map.get(key));
        }
        return res;
    }

}
