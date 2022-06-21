package interview_tasks.from_generalpdf;

import java.util.Arrays;

public class HackerRankElectronicShop {
    /*
    A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Example
The person can buy a , or a . Choose the latter as the more expensive option and return .

Function Description

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget
Returns

int: the maximum that can be spent, or  if it is not possible to buy both items
Input Format

The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models.
The second line contains  space-separated integers , the prices of each keyboard model.
The third line contains  space-separated integers , the prices of the USB drives.
     */

    public static void main(String[] args) {
        int[] arr1 = {40, 50, 60};
        int[] arr2 = {5, 8, 12};
        int b = 60;

        System.out.println(getMoneySpent(arr1, arr2, b));


    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max = Integer.MIN_VALUE;
        int sumOFTwo = 0;


        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sumOFTwo = keyboards[i] + drives[j];
                if (sumOFTwo <= b) {
                    if (sumOFTwo > max) {
                        max = sumOFTwo;

                    }
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }

        return max;
    }

}
