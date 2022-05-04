package repractice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTask01 {
    /*
    Hide Password
Given an ArrayList of passwords (String). Hide each password in a star
() format where each character is a star and print the ArrayList of
hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ **, , ** ]
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        System.out.println(hidePassword(list1));
    }

    public static ArrayList<String> hidePassword(ArrayList<String> arrList) {

        ArrayList<String> list = new ArrayList<>();


        for (String each : arrList) {
            String newEach = "";

            String[] arrStr = each.split("");

            for (int i = 0; i < arrStr.length; i++) {

                arrStr[i] = "*";

                newEach += arrStr[i];
            }
        list.add(newEach);
        }
        return list;

    }
}
