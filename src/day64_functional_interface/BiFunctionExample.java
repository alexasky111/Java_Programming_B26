package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    //compare 2 nums, find the biggest one
    //1st two types are your par types, and last one is the return type

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> maxNum = (one, two) -> {
            return one>two ? one: two;
        };
        System.out.println(maxNum.apply(10, 3));
        /*
        List<Integer> --> keys -> 1st param
        List<String> --> values -> 2nd param
        Map<Integer, String> --> final map that will be returned
         */
        BiFunction<List<Integer>, List<String>, Map<Integer, String>> createMap = (keys,values) -> {
            Map<Integer,String> map = new HashMap<>();

            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        };

        List<Integer> keys = new ArrayList<>(Arrays.asList(1,2,3));
        List<String> values = new ArrayList<>(Arrays.asList("James","Ana","Emre"));

        System.out.println(createMap.apply(keys,values));

    }
}
