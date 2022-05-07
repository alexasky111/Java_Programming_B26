package interview_tasks.nadirs_interview;

import java.util.ArrayList;
import java.util.Arrays;

public class NadirTaskDay15 {
    /*
    create a m-thod that will accept an ArrayList and return a String w/ spaces btw words
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("mehmet","nadir","saim"));
        String str = "alexandra";

        System.out.println(returnString(list));
        System.out.println(returnReversed(str));

        System.out.println(returnReversedFromArrayList(list));
        System.out.println("-----------------------");
        System.out.println(returnReversedFromArrayList(list));
    }

    public static String returnReversed(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i) + " ";
        }
        return res;
    }

    public static String returnString(ArrayList<String> list) {
        String res = "";
        if (list.size() == 0) {
            return "";
        }

        for (int i = 0; i < list.size(); i++) {
            res += list.get(i) + " ";
        }
        return res;

    }

    /*
    create a m-thod that accepts a String ArrayList and returns a String with reversed ArrayList elements
     */
    public static String returnReversedFromArrayList(ArrayList<String> list) {
        String res = "";

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i).length() - 1; j >= 0; j--) {
                res += list.get(i).charAt(j) + " ";
            }
        }
        return res;
    }

    public static ArrayList<String> ReversedFromArrayList(ArrayList<String> list){

        String res = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i).length()-1; j >=0; j--) {
                res += list.get(i).charAt(i)+ " ";
            }
        }
        String [] arr = res.split(" ");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

        return list1;
    }
}
