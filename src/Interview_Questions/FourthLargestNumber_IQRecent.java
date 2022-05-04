package Interview_Questions;

import java.util.Arrays;

public class FourthLargestNumber_IQRecent {
    /*

    Task 02 ; - Create a method that returns the 4th largest number of given int array

       Eg;  int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8}; ---> 9
            int[] arr2 ={1 , 2 , 3 , 9 , 0 };  ---> 1
     */

    public static void main(String[] args) {
        int[] arr = {2, 56, 0, 25, 1, 75, 9, 8};
        int[] arr2 = {1, 2, 3, 9, 0};
        System.out.println(calculateLargestNum(arr));
        System.out.println(calculateLargestNum(arr2));

        FourthLargestNumber_IQRecent obj = new FourthLargestNumber_IQRecent();
        System.out.println(obj.calculateLargestNum1(arr));
        System.out.println(obj.calculateLargestNum1(arr2));

    }

    //in arrays utility class we have .sort() m-thod
    //Solution 1
    public static int calculateLargestNum(int[] arr) {
        //can't do arr.sort()
        Arrays.sort(arr);
        //to see the sorted actual array before the result
        System.out.println(arr);
        return arr[arr.length - 4];

    }

    //to create own logic in instance m-thod
    public int calculateLargestNum1(int[] arr) {
        int temp;//to swap the variables
        //{2 , 56 , 0 , 25 , 1 , 75 , 9 , 8}
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i]; // temp = 2
                    arr[i] = arr[j]; // arr[i] = 0
                    arr[j] = temp; // arr[j] = 2
                }
            }
            System.out.println(Arrays.toString(arr));

        }
        return arr[arr.length - 4];
    }
}
