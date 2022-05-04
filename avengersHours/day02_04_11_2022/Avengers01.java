package day02_04_11_2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Avengers01 {
    public static void main(String[] args) {
        int[] x = {2, 5, 4, 6, 8, 9};

        System.out.println(containsNum(x, 7, 1));

        String str = "AABCCDDEE";

        System.out.println(frequencyOfChars(str));
        System.out.println(frequencyOfCharsDifferent(str));

    }
    /*
       Task 1 :     Write a method that accepts an array and prints true if it contains 2 or 3
                int[] x = {2,5,4,6,8,9}; = > true
                int[] y = {4,3,0,100,55}; = > true
                int[] z = {4,5,1,5,6}; = > false



   Task 2 :      Write a program that can find the frequency of character from a String
                               ***DO NOT use nested loop

                               "AABCCDDEE"  ==> "ABCDE"
                                output=A2B1C2D2E2
     */

    public static boolean containsNum(int[] nums, int num1, int num2) {

        for (int num : nums) {
            if (num == num1 || num == num2) {
                return true;
            }
        }

        return false;
    }

    public static boolean contain(int[] arr) {

        for (int each : arr) {
            if (each == 2 || each == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean contain(ArrayList<Integer> list) {
        //We have a Collections Utility Class method
        if (list.contains(2) || list.contains(3)) {
            return true;
        }
        return false;
    }

    public static boolean containsNum(Integer[] nums, int num1, int num2) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(nums));

        return arrList.contains(num1) || arrList.contains(num2);
    }

    public static String frequencyOfChars(String str) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(str.split("")));
        String res = "";

        for (String each : arrList) {
            int count = Collections.frequency(arrList, each);

            if (res.contains(each)) {
                continue;
            }

            res += each + count;
        }

        return res;
    }

    public static String frequencyOfCharsDifferent(String str) {

        char[] chArr = str.toCharArray();
        ArrayList<Character> chArrList = new ArrayList<>();

        for (char each : chArr) {
            chArrList.add(each);
        }
        String res2 = "";
        for (Character each : chArrList) {
            int freq = Collections.frequency(chArrList, each);
            if (res2.contains(each + "")) {
                continue;
            }
            res2 += "" + each + freq;
        }
        return res2;
    }

}

