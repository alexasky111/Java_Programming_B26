package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Task_LastWithArrayANDNUmber {
    /*
    Create a method that accepts an int array. Count how many even and odd
numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd
elements
Ex:
input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
    public static void getEvenOrOdd(int[] nums) {

        // 1. To make 2 variables to count the numbers
        int evenNums = 0;
        int oddNums = 0;
        // 2. To loop through the numbers in an Array
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) { // ODD
                evenNums++;
            } else { // Rest EVEN
                oddNums++;
            }
        }
        // 3. To create a separate Array based on the count and requirements
        int [] res = {evenNums, oddNums};
        // 4. To always print an int Array
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array length");
        int[] arr = new int[in.nextInt()];

        // 5. To loop through the questions to Enter The Number based on the length of the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number: ");
        // 6. Syntax to accept quantity of numbers based on the Array length
            arr[i] = in.nextInt();
        }
        // 7. To call the method
        getEvenOrOdd(arr);
    }
}
