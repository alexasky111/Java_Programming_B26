package day37_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 2,550,000,000 results (1.00 seconds)";
        // 1. To break up the String and make an Array(5 elements)
        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr)); // just to see what my elements are

        // 2. To pull the elements that are String numbers
        String resultStr = arr[1].replace(",","");// need to replace comas
        String timeStr = arr[3].substring(1);// need to replace/delete "("
        System.out.println(resultStr);
        System.out.println(timeStr);

        // 3. To check max value of Integer
        System.out.println(Integer.MAX_VALUE);

        // 4.Taking String number and convert in Long datatype number
        long resultNumber = Long.parseLong(resultStr);

        // 5. Taking String number and convert in Double datatype number
        double timeNumber = Double.parseDouble(timeStr);

        if(resultNumber >= 0){
            System.out.println("Test case passed - positive number");
        }
        if(timeNumber<=2 && timeNumber>=0){
            System.out.println("Task case passed under 2 seconds");
        }


    }
}
