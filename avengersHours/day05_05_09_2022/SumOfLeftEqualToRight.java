package day05_05_09_2022;

public class SumOfLeftEqualToRight {
    /*
      Task 02 ;  Given an array of integers, write a function to return the item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

                  For example :
                          Given [4, 9, 1, 3, 6, 4]
                          your function should give item 1, because 4+9 = 3+6+4
     */
    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 3, 6, 4};
        System.out.println(equilibrium(nums));
    }

    public static int equilibrium(int[] arr) {
        int result = 0;
        // [4, 9, 1, 3, 6, 4]
        for (int i = 0; i < arr.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;
            for (int j = 0; j < i; j++) {
                sumOfLeft += arr[j];
            }
            for (int k = i+1; k < arr.length; k++) {
                sumOfRight += arr[k];
            }

            if (sumOfLeft == sumOfRight) {
                result = arr[i];
                break;
            }
        }

        return result;
    }

}
