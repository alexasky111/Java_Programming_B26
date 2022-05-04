package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ForEachLoop {
    public static void main(String[] args) {

            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            int[] nums = new int[3];
            for(int i = 0; i < 3; i++) {
                nums[i] = scan.nextInt();
            }

            //WRITE YOUR CODE BELOW
            int [] expanded = new int [6];
            int index = 0;

            for (int each : nums) {
                if (each != 0) {
                    expanded[index] = each;
                    index++;
                }
            }
            System.out.println(Arrays.toString(expanded));

        }

    }
