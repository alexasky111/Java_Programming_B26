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
        //1- create a container to add the results and match the return data type
        String res = "";

        //2- create an ArrayList to be able to work w/ Collection datatype
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        //3- have a count var that will set up the frequency of the characters
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        //4- going through the list and checking if String which is a key contains in the Map, if yes incrementing the count which is a value
        for (String each : list) {
            if (map.containsKey(each)) {
                count = map.get(each) + 1;
                //putting in the map new values: String=key, int=value
                map.put(each, count);
            } else {
                //setting the count which is a value from 1
                map.put(each, 1);
            }
        }
        //adding to the String res .get(key) -> returns the value
        for (String key : map.keySet()) {
            res += (key + "" + map.get(key));
        }
        return res;
    }

}
