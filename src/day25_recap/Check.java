package day25_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void getEvenAndOdd(int [] arr){

        int countEven = 0;
        int countOdd = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int [] res = {countEven, countOdd};
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int [] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the numbers");
            arr[i] = input.nextInt();
        }

        getEvenAndOdd(arr);
    }
}
