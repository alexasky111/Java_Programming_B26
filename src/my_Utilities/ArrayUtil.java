package my_Utilities;

import java.util.Arrays;

public class ArrayUtil {

    // Method 1
       /*
    create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber (int [] nums) {

        // 1. to have a value to compare with we start with 1st element in the Array
        int min = nums[0];

        for (int num : nums){
            // every element of the array is num if it's less than the min it'll be reassigned
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static int minNumberSort(int [] nums){
        // Can do it this way, in a sorted Array the smallest will be the 1st num
        Arrays.sort(nums);
        return nums[0];
    }

    // Method 2
       /*
    create a method that will accept an int array and return the smallest number from the array
     */
    public static int maxNumber(int [] nums){

        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    //Method 3
        /*
    Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static boolean contains (int [] nums, int element) {
        // To loop through Array to see if the num is there, if each=element in the Array return true
        for (int each : nums) {
            if(each==element){
                return true;
            }
        }
        // By default my Array doesn't contain the element
        return false;
    }

    //Method 4
     /*
    Add Element
create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static int [] addElement (int[] original, int elementToAdd){
        // Instead of doing a loop ourselves we could have used Arrays.copyOf()
        int [] newArray = new int [original.length+1];
        for (int i = 0; i < original.length; i++) {
            //In the new array at position of i, we're storing all values of i from the original array
            newArray[i] = original[i];
        }
        //Storing to the last element of an Array the number from method parameter
        newArray[newArray.length-1] = elementToAdd;
        return newArray;
    }

    // Method 5
    public static int indexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            // 1. I am trying to find an element through the Array; If multiple it returns the 1st occurance of the number
            if (nums[i] == element) {
                // 2. if we found a match we return i
                return i;
            }

        }   // 3. if we don't find a match we'd return -1
        return -1;
    }

    //Method 6
    public static int indexOf(String[] str, String element) {
        // Second version of the method indexOf
        for (int i = 0; i < str.length; i++) {
            //strings can't be compared w/ == sign
            if (str[i].equals(element)) {
                return i;
            }

        }
        return -1;
    }


    // Method 7
    public static String [] addElement(String [] original, String elementToAdd){
        //1. This method accepts array String and String element. First declare new String Array + new String element
        String [] newArray = new String [original.length + 1];

        //2. To loop through an input array to store all values in positions of i to new Array
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        //3. To assign in the new array at the last position the elementToAdd
        newArray[newArray.length-1] = elementToAdd;
        //4. This method returns newArray
        return newArray;
    }

    // null - place holder for object


    // Method 8
    public static int[] addElement(int[] original, int[] elementsToAdd) {
        int[] newArray = new int[original.length + elementsToAdd.length];
        // 1. Assigning to my new Array right away
        for (int i = 0, j=0; i < newArray.length; i++) {
            if (i < original.length) {
                // added the elements from the original array in the array
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] =elementsToAdd[j++]; // ==> this is a different array it'll start from 0, I need a 1st element from the 2nd array in the position of a new array
            }

        }
        return newArray;
    }

}

