package day36_overloading_method;

import java.util.Arrays;

public class AddElementArrayToArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(addElement(a, b)));

        int [] y = {5,23,6,21};
        int [] z = {3,23,6};
        System.out.println(Arrays.toString(addElement(y,z))); // my method returns me an Array
    }

//public static int [] addElement(int [] original, int [] elementsToAdd){
//        // 1. To create new array
//    int [] newArray = new int[original.length + elementsToAdd.length];
//        // 2. To Loop through a 1st array and assign values of original array to the positions of new Array
//    for (int i = 0; i < original.length; i++) {
//        newArray[i] = original[i];
//    }   // 3. To loop through the numbers of 2nd array and assign numbers to the position of newArray with already nums of original array
//    for (int i = original.length, j = 0; i < newArray.length ; i++, j++) {
//        newArray[i] = elementsToAdd[j];
//    }
//    return newArray;
//}
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



