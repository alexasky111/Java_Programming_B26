package saims_practices_for_loopsArrayMethod;

public class Array_T04 {
    public static void main(String[] args) {
        /*
        Reverse Array
Write a program that will reverse the order of any given array
Ex:
Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
         */
        int numbers[] = {1, 2, 3, 4, 5};

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

    }
}
