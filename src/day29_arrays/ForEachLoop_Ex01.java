package day29_arrays;

import java.util.Arrays;

public class ForEachLoop_Ex01 {
    public static void main(String[] args) {
        int[] nums = {30, 12, 159, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional " + nums[i]); //allows to print every element
        }
        System.out.println();

        for (int element : nums) {// Im starting from element --> Im going to nums
            System.out.println("for each: " + element); // "element" is like "i"
        }

        String[] classes = {"java", "soft skills", "selenium", "database", "api"};

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]); // print the values --> how I access every element of my Array
        }
        System.out.println();
        // for each

        for (String word : classes) { // Im trying to go through classes Array
            System.out.println(word); // ---> word will be every element from the String
        }
        System.out.println();
// -------> You use it only when you need to read, can't use each element from it <--------
        double[] prices = {10.4, 30.6, 38.9}; // <---- Double Array

        //for each
        for (double each : prices){
            System.out.println("$"+each);
        }

    }
}
