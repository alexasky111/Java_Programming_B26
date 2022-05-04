package repractice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class MehmetTask01 {
    public static void main(String[] args) {
        /*
        1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
         */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"D", "E", "F", "G"};
        System.out.println(combineTwoStrings(str1, str2));

        System.out.println(changeLastElementToZero(nums));
        System.out.println(swapTheFirstAndLast(nums));
        System.out.println(swapTheFirstAndLastManual(nums));
        System.out.println(multiplyOddByTwo(nums));

        nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        System.out.println(largestNumber(nums, 5));

    }
    /*
     2. write a program that can swap the first and last elements of an ArrayList

            3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]

            4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */

    public static ArrayList<Integer> changeLastElementToZero(ArrayList<Integer> nums) {

        nums.set(nums.size() - 1, 0);
        return nums;
    }

    public static ArrayList<Integer> swapTheFirstAndLast(ArrayList<Integer> nums) {
        Collections.swap(nums, 0, nums.size() - 1); // To Swap elements w/ Collections

        return nums;
    }

    public static ArrayList<Integer> swapTheFirstAndLastManual(ArrayList<Integer> nums) {
        int num1 = nums.get(0);
        int num2 = nums.get(nums.size() - 1);

        nums.set(0, num2);
        nums.set(nums.size() - 1, num1);

        return nums;

    }

    public static ArrayList<Integer> multiplyOddByTwo(ArrayList<Integer> nums) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 1) {
                numbers.add(num * 2);
            } else {
                numbers.add(num);
            }

        }
        return numbers;

    }

    public static ArrayList<String> combineTwoStrings(String[] str1, String[] str2) {
        ArrayList<String> joint = new ArrayList<>(Arrays.asList(str1));

        joint.addAll(Arrays.asList(str2));
        return joint;
    }
    /*
        Task 2 : write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4
     */

    public static int largestNumber(ArrayList<Integer> nums, int num) {

        Collections.sort(nums);
        Collections.reverse(nums);

        for (int i = 0; i < nums.size() - 1; i++) {
            if (Objects.equals(nums.get(i), nums.get(i + 1))) {
                nums.remove(nums.get(i));
            }
        }

        return nums.get(num - 1);

    }
       /*

           Task 3 : write a program that can find the frequency of character from a String
                                    DO NOT use nested loop

                                    "AABBCCDDEE"  ==> "ABCDE"
                                    output: A2B2C2D2E2

     */

    public static String findFrequencyOfChar(String fixed) {
        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(fixed.split("")));
        //To do the loop that goes through the new ArrayList
        for (int i = 0; i < list.size(); i++) {
            //To check if the new String contains the character already, then we don't include it
            if (!result.contains(list.get(i))) {
                result += list.get(i) + Collections.frequency(list, list.get(i)); // to follow the requirements format and 1st add the character in the ArrayList and then concatenate with the Collections.frequency method and return
            }

        }
        return result;
    }
//    public class P05_FrequencyOfCharacters {
//        public static void main(String[] args) {
//            String str = "AAABBCDDDDEEE";
//            String result = "";             // A3B2C1D4E3
//
//            ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split(""))  );
//            // in order to be able to use frequency method
//
//
//            for(String each : list ){
//                int frequency = Collections.frequency(list, each);
//
//                if(result.contains(each)) { // to avoid duplicated characters in the result
//                    continue;
//                }
//
//                result += each + frequency;
//
//            }
//
//            System.out.println(result);
//
//
//
//        }
    }



