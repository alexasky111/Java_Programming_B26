package day63_functional_interface.homework;

import day54_abstraction.creating.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Task01 {

    public static void main(String[] args) {
        //Use ListFunction functional interface to:
        // 1.1 Create a function that can return the maximum number from a list of Integer
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100, 300, 50, 40, 2, 0));
        Function<ArrayList<Integer>, Integer> maxNum = arrList -> {
            int max = arrList.get(0);
            for (int each : arrList) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        };
        System.out.println(maxNum.apply(list));
        System.out.println("--------");

        // 1.2 Create a function that can return the minimum number from a list of Integer
        Function<ArrayList<Integer>, Integer> minNum = arrList -> {
            int min = arrList.get(0);
            for (int each : arrList) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        };
        System.out.println(minNum.apply(list));
        System.out.println("--------");

        // 1.3 Create a function that can return the longest String from a List of String
        List<String> list1 = new ArrayList<>(Arrays.asList("abc", "bbbbb", "ccccccccccc"));
        Function<List<String>, String> longestStr = (t) -> {
            String longestString = "";
            int maxLength = t.get(0).length();
            for (String s : t) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    longestString = s;
                }
            }
            return longestString;
        };

        System.out.println(longestStr.apply(list1));
        System.out.println("--------");

        // 1.4 Create a function that can return the shortest String from a List of String

        Function<List<String>, String> shortestStr = (t) -> {
            String shortestString = "";
            int minLength = (int) Double.MAX_VALUE;
            for (String s : t) {
                if (s.length() < minLength) {
                    minLength = s.length();
                    shortestString = s;
                }
            }
            return shortestString;
        };

        System.out.println(shortestStr.apply(list1));
        System.out.println("--------");

        // 1.5 Create a function that can convert List of integer to int array
        List<Integer> arrList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Function<List<Integer>, int[]> convertArrListToArr = (t) -> {
            int[] arr = new int[t.size()];
            int index = 0;
            for (Integer integer : t) {
                arr[index] = integer;
                index++;
            }
            return arr;
        };
        System.out.println(Arrays.toString(convertArrListToArr.apply(arrList)));
        System.out.println("--------");
        // 1.6 Create a function that can convert List of double to double array
        List<Double> arrListOfDouble = new ArrayList<>(Arrays.asList(100.1, 20.0, 30.5, 40.7, 50.9));
        Function<List<Double>, double[]> convertArrListToArrDouble = (t) -> {
            double [] arr = new double[t.size()];
            int index = 0;
            for (Double each : t) {
                arr[index] = each;
                index++;
            }
            return arr;
        };
        System.out.println(Arrays.toString(convertArrListToArrDouble.apply(arrListOfDouble)));
        System.out.println("--------");
    }


}
