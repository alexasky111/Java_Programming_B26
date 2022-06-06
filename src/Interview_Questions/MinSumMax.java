package Interview_Questions;

public class MinSumMax {
    public static void main(String[] args) {

        int [] arr = {1,3,5,7,9};
        System.out.println(minMaxSum(arr));

    }

    /*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    https://www.hackerrank.com/challenges/mini-max-sum/problem
     */

    public static String minMaxSum(int [] arr){
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int skipNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != skipNum){
                    temp += arr[j];
                }
            }
            skipNum++;
            if (temp > maxNum ){
                maxNum = temp;
            }else if(temp < minNum){
                minNum = temp;
            }
        }

        return "Max sum " + maxNum + " Min sum " + minNum;

    }
}
