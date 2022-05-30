package day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        //<T,R>
        //1. defined obj as arr
        //2.
        Function<int[], List<Integer>> convertArrToList = (nums) ->{
            //doesn't work with int, only Wrapper Class
            List<Integer> list = new ArrayList<>();
            for(int each: nums){
                list.add(each);
            }
            return list;
        };

        int[] a = {12,34,33,21};
        List<Integer> list = convertArrToList.apply(a);
        System.out.println(list);

    }
}
