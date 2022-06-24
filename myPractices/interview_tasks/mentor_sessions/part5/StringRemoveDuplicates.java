package interview_tasks.mentor_sessions.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringRemoveDuplicates {
    /*
    3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "FAAABBBCCCDDF";

        System.out.println("Remove Duplicates: " + removeDuplicates(str));
        System.out.println("Remove Duplicates with Stream: " + removeDuplicatesWithStream(str));
        System.out.println("Remove Duplicates with ForEach function: " + removeDuplicatesWithForEachFunction(str));
    }

    public static String removeDuplicates(String str) {
        //1- create a container to store the res
        String output = "";
        //2- run a loop to check if an element is in the given str already
        for (int i = 0; i < str.length(); i++) {
            //3- if the element is not in the str already - add it to the container
            if (!output.contains(str.charAt(i) + "")) {
                output += str.charAt(i) + "";
            }
        }
        return output;
    }

    public static String removeDuplicatesWithStream(String str) {
        //1- create a List to have a Collection type to use Collections and Stream
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        //2- to get rid of duplicates --> distinct(): gets rid of duplicates; collect(): method to take all elements to allow conversion to another type arguments: Collectors.toList(): returns elements as a List
        list = list.stream().distinct().collect(Collectors.toList());

        //3- container to store the res and return correct data type
        String res = "";
        //4- to add all the non-duplicate elements
        for (String s : list) {
            res += s;
        }
        return res;
    }

    public static String removeDuplicatesWithForEachFunction(String str) {

        //1- create a List to be able to work w/ Collection type
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        //2- to have a container to put non-duplicates
        List<String> output = new ArrayList<>();

        //3- forEach() method is a utility function of Iterable Interface to iterate over a collection such as (list, set or map) and stream. It is used to perform a given action on each the element of the collection
        list.forEach(each -> {
            if (!output.contains(each)) {
                output.add(each);
            }
        });
        //4- to have a container to add all the non-duplicates in order to match the return data type
        String res = "";

        for (String e : output) {
            res += e;
        }
        return res;
    }


}

