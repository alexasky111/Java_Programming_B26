package interview_tasks.mentor_sessions.part2;

public class Array_FindMin {
    public static void main(String[] args) {
        int [] arr = {14,66,8,9,45};

        System.out.println(findMin(arr));
    }
    /*
    10) Array - Find Minimum
Write a method that can find the maximum number from an int Array
     */

    public static int findMin(int [] arr){
        int num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num){
                num = arr[i];
            }
        }
        return num;
    }
}
