package day26_nested_loops.day30_Arrays_Loops;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split(","); // now all of my Days of the week will be the Array elements
        // System.out.println(Arrays.toString(days)); format of printing in an Array
        for ( String eachDay : days) {
            System.out.println(eachDay);
        }
        String [] withOutDay = s.split("day"); //
       for (String each : withOutDay) {
           System.out.println(each);
       }

       String str = "Jan-Feb-March-Apr-May-Jun-JUl-Aug-Sep-Oct_nov-Dec";
       String [] month = str.split("-");
        for (String each : month) {
            System.out.println(each);
        }
    }
}
