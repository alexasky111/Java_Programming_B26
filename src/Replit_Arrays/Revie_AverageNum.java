package Replit_Arrays;

public class Revie_AverageNum {
    public static void main(String[] args) {
        int[] nums = {10,15,5,6};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("av: "+sum/nums.length);
        //for each

        for (int each : nums) {
            sum += each;
        }
        System.out.println("av: "+sum/nums.length);
    }

}
