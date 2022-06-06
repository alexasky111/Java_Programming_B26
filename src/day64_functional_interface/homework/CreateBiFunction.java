package day64_functional_interface.homework;

import day54_abstraction.creating.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class CreateBiFunction {
    //    Use BiPredicate functional interface to:
//    1.1 Create a function that can check if two array are equal and contains the same elements
//    ex: arr1 = {3,2,1}
//    arr2 = {2,1,3}
//
//    output: true
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer[]> sameArrays = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };
        Integer[] arr1 = {3, 2, 1};
        Integer[] arr2 = {2, 1, 3};
        System.out.println(sameArrays.test(arr1, arr2));

//            1.2 Create a function that can check if the first array contains all the elements of the second array:
//    ex: arr1 = {1,2,3,4,5,6}
//    arr2 = {7,8}
//
//    output: false

        BiPredicate<Integer[], Integer[]> containsElement = (one, two) -> {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(one));

            for (int i = 0; i < list1.size(); i++) {
                for (Integer each : two) {
                    if (list1.contains(each)) {
                        return true;
                    }
                }
            }

            return false;

        };

        Integer[] one = {1, 2, 3, 4, 5, 6};
        Integer[] two = {7, 8, 2};
        System.out.println(containsElement.test(one, two));


//    Use BiFunction functional interface to:
//            1.1 Create a fucntion that can returns the common characters of two strings
//    ex: str1 = "Python"
//    str2 = "Wooden Spoon"
//
//    output: on

        BiFunction<String, String, String> returnCommonChars = (str1, str2) -> {
            String commonChars = "";
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        if (!commonChars.contains(str1.charAt(i) + "")) {
                            commonChars += str1.charAt(i);
                        }
                    }
                }
            }

            return commonChars;

        };

        String s = "Python";
        String s1 = "Wooden Spoon";

        System.out.println(returnCommonChars.apply(s, s1));


//        1.2 Create a function that can return the common elements of two Lists of Integers
        BiFunction<List<Integer>, List<Integer>, String> commonCharsInList = (list2, list3) -> {
            StringBuilder commonChars = new StringBuilder();

            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < list3.size(); j++) {
                    if (list2.get(i).equals(list3.get(j))) {
                        commonChars.append(list2.get(i)).append(" ");
                    }
                }
            }

            return String.valueOf(commonChars);
        };

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 8));

        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 6, 7, 8, 8, 9, 0));
        System.out.println(commonCharsInList.apply(integerList, integerList1));
    }
}
