package interview_tasks.mentor_sessions;

public class Array_FindMax {
    public static void main(String[] args) {

        int [] arr = {1,33,5,677,8};
        System.out.println(findMax(arr));
    }
    /*
    9) Array - Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static int findMax(int [] arr){
        int num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
}
