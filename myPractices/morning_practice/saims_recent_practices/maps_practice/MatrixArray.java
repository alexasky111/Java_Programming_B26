package morning_practice.saims_recent_practices.maps_practice;

import java.util.Arrays;

public class MatrixArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        System.out.println(returnSumOfDiagonals(arr));

    }
    // https://www.hackerrank.com/challenges/diagonal-difference/problem

    public static int returnSumOfDiagonals(int[][] arr) {

        int diagOne = 0;
        int diagTwo = 0;
        int count = 0;
                                                //  1  2  3
        for (int i = 0; i < arr.length; i++) {  // {{},{},{}}
            for (int j = 0; j < arr[j].length;) {
                j = count;
                diagOne += arr[i][j];
                break;
            }
            count++;
        }
        System.out.println(diagOne);
        count = arr[0].length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; ) {
                j = count;
                diagTwo += arr[i][j];
                break;
            }
            count--;
        }
        System.out.println(diagTwo);

        return (diagOne - diagTwo);
    }

}
