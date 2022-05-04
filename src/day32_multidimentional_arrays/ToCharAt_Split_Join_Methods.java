package day32_multidimentional_arrays;

import java.util.Arrays;

public class ToCharAt_Split_Join_Methods {
    public static void main(String[] args) {
        int [] arr = {30,90,60,360,180};
        int [] arr2 = {180,360,30,90,60};
        // 1. pringting the Arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Before sorting: "+Arrays.equals(arr,arr2));

        // 2. sorting to check if they're equal --> first-call the action, 2nd-print
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("After sorting: "+Arrays.equals(arr,arr2));

        // 3. using joint method
        String[] words = {"hello", "java", "Saturday"};
        System.out.println(String.join("###", words));

        // 4. using toCharArray to transform a String into an Array
        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));

        // 5. using a String's split method to get an ARRAY
        System.out.println(Arrays.toString(str.split(" ")));

    }
}
