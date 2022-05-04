package Replit_Arrays;

import java.util.Arrays;

public class Review_SplitMethod {
    public static void main(String[] args) {
        String s = "monday, tuesday, wednesday";
        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        for (String day : days) {
            System.out.println(day);
        }

        String [] withoutDAy = s.split("day");
        for (String each : withoutDAy) {
            System.out.println(each);
        }
        System.out.println();
        String str = "Jan-Feb-Mar-Apr";
        String [] month = str.split("-");
        for (String each : month) {
            System.out.println(each);
        }







    }
}
