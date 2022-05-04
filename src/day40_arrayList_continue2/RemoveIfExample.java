package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,6,2,5,12,9,143,4));
        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf(n -> n % 2 == 0); // n is a variable to define every element
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(base);
        // nums.removeIf - predicate type (n -> n % 2 == 0); - lambda expression
        nums2.removeIf(each -> each > 10); //I'll remove num if each-num is more than 10
        System.out.println(nums2);

        //  Calling the method that I created in the class ArrayListWithMethods
        ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        days.removeIf(day -> day.startsWith("S") || day.startsWith("T"));
        System.out.println(days);
    }
}
