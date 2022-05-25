package interview_tasks.mentor_sessions;

import java.util.Arrays;

public class UniqueIntegersThatSumToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(5)));
        /*
        num = 5;
       {-4 -2 0 2 4 }
        0   1 2 3 4
         */

    }

    public static int[] sumUpToZero(int num){
        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i * 2 - num + 1;
        }
        return arr;
    }





        /*
    13) Array - N unique integers that sum up to 0
Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers)
     */


}
