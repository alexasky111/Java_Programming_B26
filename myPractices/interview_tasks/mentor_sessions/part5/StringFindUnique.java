package interview_tasks.mentor_sessions.part5;

import java.util.*;

public class StringFindUnique {
    /*
4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("Find Unique: " + findUnique(str));
        System.out.println("Find Unique w/ lambda: " + findUniqueWitLambda(str));
    }

    public static String findUnique(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String findUniqueWitLambda(String string) {

        //1- create a List to be able to work w/ Collection type
        List<String> list = new ArrayList<>(Arrays.asList(string.split("")));
        //2- removing elements that appear more than once in a List
        list.removeIf(each -> Collections.frequency(list, each) > 1);
        //3- adding to an empty container to match the return data type
        String res = "";
        //4- adding all the unique elements to an empty String res
        for (String each : list) {
            res += each;
        }
        return res;
    }


}
