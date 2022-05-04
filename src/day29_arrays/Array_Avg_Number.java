package day29_arrays;

public class Array_Avg_Number {
    public static void main(String[] args) {
        int [] nums = {10,15,5,6};
        int sum = 0;

//        for (int i = 0; i < nums.length; i++) {
//            sum +=nums[i];
//        }
        for(int num : nums) {
           sum += num;
        }
        System.out.println("average: "+(sum/nums.length));
    }
}
