package day35_return_method;

public class AddElementArray {
    /*
    Add Element
create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */
    public static int [] addElement (int [] arr, int num){
        // 1. To create a brand new Array w/ plus one element
    int [] arr1 = new int [arr.length+1];

        // 2. To assign the input num to the last element in the Array
    arr1 [arr1.length-1] = num;

        // 3. To loop through and build a new Array "arr1"
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
