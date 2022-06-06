package day65_streams;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
        /*
        1.1 Create a function that can check if two array are equal and contains the same elemnts
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true
 */
        //we are not defining a collection we are working with, an array itself is an obj, that's why i am bale to put just int not Wrapper Class Integer
        BiPredicate<int[], int[]> arrayIsEqual = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        int[] arr1 = {3, 2, 1};
        int[] arr2 = {1, 2, 3};

        System.out.println(arrayIsEqual.test(arr1, arr2) ? "Arrays are equal" : " Arrays are different");


    /*
       1.2 Create a function that can check if the first array contains all the elemnts of the second array:
                  ex: arr1 = {1,2,3,4,5,6}
                      arr2 = {7,8}

                  output: false
       */
        BiPredicate<int[], int[]> firstContains = (array1, array2) -> {

            String str = Arrays.toString(array1);

            for (int outer : array2) {
                boolean check = false;

                for (int inner : array1) {
                    if (outer == inner) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    return false;
                }
            }
            return true;
        };

        //merge 2 arrays into list
        //1st two generics for the parameters
        //last generics is for the return type
        BiFunction<int[], int[], List<Integer>> mergeList = (array1, array2) -> {

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < array1.length; i++) {
                list.add(array1[i]);
                list.add(array2[i]);
            }
            return list;
        };
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {4, 5, 6};

        System.out.println(mergeList.apply(arr5, arr6));

    }
}