package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;

public class Array_T03 {
    public static void main(String[] args) {
        /*
        Write a program that can count the even and odd number from an array of
integers
Ex:
Input: [4,1,3,12,5]
Output:
Even: 2
Odd: 3
         */
      int [] numbers = {4,1,3,12,5};
      int firstIndex = numbers[0];
      int countEven = 0;
      int countOdd = 0;


        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] % firstIndex == 0) {
                countEven++;
            } else {
                countOdd++;
            }


        }


        System.out.println(Arrays.toString(numbers));
        System.out.println("Even numbers: "+countEven+"\nOdd numbers: "+countOdd);

    }
}
