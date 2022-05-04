package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());
        // To use the method w/ a help of a reference
        ArrayList<String> days = getDaysOfWeek();
        //To access 1st element in the ArrayList from the method w/ a help of a reference - days
        System.out.println(days.get(0));
        //Or
        System.out.println(getDaysOfWeek().get(0));

        // The method accepts the ArrayList that is also a method getDaysOfWeek(); getDaysOfWeek returns days of the week
        System.out.println(printList(getDaysOfWeek()));

        //Here created the array list instead of using one from getDaysOfWeek, and used method printList() that accepts the array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(printList(list));
    }

    public static String printList(ArrayList<String> list) {
        String str = "List: ";
        for (String each : list) {
            str += "\n~\t" + each;
        }
        return str;
    }


    public static ArrayList<String> getDaysOfWeek() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;
    }
        /*
        String a = "abc";
        a.toUpperCase().replace("a", "d").trim();
       a = a.toUpperCase()
        .replace("a","d")
        .trim();
         */
}

