package day01_04_04_2022;

public class Task02_Arrays {
    public static void main(String[] args) {
        /*
         Write a method that accepts an array and return true if 6 appears as either the first or last element in the array.

         int[] x = {1,2,6};  ---> true
         int[] y = {6,3,5,7,9};  ---> true
         int[] z = {2,6,6,6,6,1};  ---> false
         */
        int[] x = {1,2,6};  //---> true
        int[] y = {6,3,5,7,9}; // ---> true
        int[] z = {2,6,6,6,6,1}; // ---> false
        System.out.println(startEndWithSix(x));
        System.out.println(startEndWithSix(y));
        System.out.println(startEndWithSix(z));
    }

    public static boolean startEndWithSix(int [] nums){

        for (int i = 0; i < nums.length; i++) {
            if (nums[0]==6 || nums[nums.length-1]==6){
                return true;
            }

        }
        return false;

    }


}
