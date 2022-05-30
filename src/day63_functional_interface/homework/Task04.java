package day63_functional_interface.homework;

import java.util.*;
import java.util.function.Function;

public class Task04 {
    public static void main(String[] args) {

        //    Use Function functional interface to:
        //1.1 Create a function that can return the sum of digits from a string that contains number digits
        String result = "1234";
        Function<String, Integer> returnSumOfNums = (str) -> {
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(str.charAt(i)+"");
            }
            return sum;
        };
        System.out.println(returnSumOfNums.apply(result));

        //1.2 Create a function that can convert a Set of Integers to List of Integers
        Set<Integer> integerSet = new HashSet<>(); //Set doesn't let duplicates, no indexes
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        integerSet.add(50);
        System.out.println(integerSet);
        Function<Set<Integer>, List<Integer>> convertSetToList = (t)->{
            List<Integer> list = new LinkedList<>();
            for (Integer integer : t) {
                list.add(integer);
            }
            return list;
        };
        System.out.println(convertSetToList.apply(integerSet));
        //1.3 Create a function that can return the reversed version of a String array
        String [] strArr = {"cat", "dog", "fish", "parrot", "ferret"};

        Function<String[], String[]> reverseArr = (arr)-> {
            String [] strArr1 = new String [arr.length];
            int index = 0;
            for (int i = arr.length-1; i >= 0; i--) {
                strArr1[index] = arr[i];
                index++;
            }
            return strArr1;
        };
        System.out.println(Arrays.toString(reverseArr.apply(strArr)));

    }
}