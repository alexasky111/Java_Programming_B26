package day29_arrays;

public class Array_Even_Or_Odd {
    public static void main(String[] args) {
        /*
        Even and odd from array
Write a program that can count the even and odd number from an array of
integers
Ex:
Input: [4,1,3,12,5]
Output:
Even: 2
Odd: 3
         */
        int [] nums = {4,1,3,12,5};
        int even = 0; // it is not MAX and MIN task when we need to compare. here we have counters, we cant assign nums[0]
        int odd = 0;
        String evenNumbers = "";
        String oddNumbers = "";

//        for (int i = 0; i < nums.length; i++) {
//
//            if ( nums[i] % 2 == 0){
//                even++;
//                evenNumbers += nums[i] + " ";
//            } else {
//                odd++;
//                oddNumbers += nums[i] + " ";
//            }
//
//        }
        for (int number : nums ) //"number" is a variable, "nums" going through each number in array
        {
            if (number % 2 == 0){
                even++;
                evenNumbers += number + " ";
            } else {
                odd++;
                oddNumbers += number + " ";
            }
        }
        System.out.println("even counter "+even+"\nodd counter "+odd);
        System.out.println("even "+evenNumbers+"\nodd "+oddNumbers); // This wasn't in the requirement: we add each number to show which were even, which were odd
    }
}
