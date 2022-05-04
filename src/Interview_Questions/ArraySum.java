package Interview_Questions;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findTwoElements(new int[]{13,43,2,71}, 84)));
    }

    public static int[] findTwoElements(int[] arr, int c) {
        int[] output = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (arr[i] + arr[j] == c) {
                output[0] = arr[i];
                output[1] = arr[j];
                }
            }
        }
        return output;
    }
}
