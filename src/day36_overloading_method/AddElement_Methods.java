package day36_overloading_method;

import java.util.Arrays;

public class AddElement_Methods {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = addElement(a,4);
        System.out.println(Arrays.toString(b));
    }
    // Method 1 accept int array and int element and added to the end of our Array; The size is fixed, so we need ot make a new array that had an extra size, then we loop through to add, it works only one element at the time, not multiple
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

    // Method 2
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
    // Method 3

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
