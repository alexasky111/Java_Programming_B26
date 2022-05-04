package interview_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountChars {
    /*
    1.
   YOU WILL USE 3 WAY TO DO THAT.
    1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
    Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "AAABBCDD";

//        System.out.println(frequencyOfChar(str));
//        System.out.println(frequencyOfCharWithForLoop(str));
        System.out.println(frequencyOfCharWithCollections(str));
    }

    public static String frequencyOfChar(String str) {

        String fixed = "";
        //to set the condition, till str is empty we are checking
        while (!str.isEmpty()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(0))
                    count++;
            }
            if (!fixed.contains(str.charAt(0) + "")) {
                fixed += "" + str.charAt(0) + count;
            }
            str = str.substring(1);


        }
        return fixed;
    }


    public static String frequencyOfCharWithForLoop(String str) {

        String fixed = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!fixed.contains(str.charAt(i) + "")) {
                fixed += "" + str.charAt(i) + count;
            }
        }
        return fixed;
    }

    public static String frequencyOfCharWithCollections(String str) {

        String fixed = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            if (!fixed.contains(list.get(i) + "")) {
                fixed += "" + list.get(i) + count;
            }
        }
        return fixed;
    }


}
