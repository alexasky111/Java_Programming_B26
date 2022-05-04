package Replit_Arrays;

import java.util.Scanner;

public class Array_NotDuplicate {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        for(int i = 0; i < nums.length; i++) {
            boolean isNotDuplicate = true;
            for (int j = 0; j < nums.length; j++ ){
                if ((nums[i] == nums[j]) && (i != j)){
                    isNotDuplicate = false;
                }
            }
            if (isNotDuplicate) {
                System.out.println(nums[i]);

            }
        }



    }
}
