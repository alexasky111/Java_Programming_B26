package day15_04_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallTasks {
    public static void main(String[] args) {
        /*
        1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];

            2. write a program that can swap the first and last elements of an ArrayList

            3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]

            4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

           Task 2 : write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4

           Task 3 : write a program that can find the frequency of character from a String
                                    DO NOT use nested loop

                                    "AABBCCDDEE"  ==> "ABCDE"
                                    output: A2B2C2D2E2
         */
        System.out.println("===Task 5===");
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        System.out.println(numbers1);
        int n = 3;

        System.out.println(NthMax(numbers1, n));


        System.out.println("===Task 1===");
        ArrayList<Integer> numbers = new ArrayList<>(); //an arrayList
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7)); //declared all values at once
        numbers.set(numbers.size() - 1, 0);
        System.out.println(numbers);

        System.out.println("===Task 2===");
        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);

        System.out.println("===Task 3===");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) { //it means it is odd num
                numbers.set(i, numbers.get(i) * 2); // use swap() to replace old element i with element i*2
            }
        }
        System.out.println(numbers);

        System.out.println("===Task 4===");
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(arr1));
        System.out.println(result);
        result.addAll(Arrays.asList(arr2));
        System.out.println(result);

        char[] carr1 = {'A', 'B', 'C'}, //has to be non primitive type can't be char[] in Arrays.asList
                carr2 = {'D', 'E', 'F', 'G'};

        ArrayList<Character> charResult = new ArrayList<>();
        //charResult.addAll(Arrays.asList(carr1));
        //To convert char to Character class we need to do it one by one
        for (char c : carr1) {
            charResult.add(c);
        } // it will do boxing one by one
        System.out.println(charResult);
        //charResult.addAll(Arrays.asList(carr1));
        for (char c : carr2) {
            charResult.add(c);
        } // it will do boxing one by one
        System.out.println(charResult);


    }

    public static int NthMax(ArrayList<Integer> numbers, int n) {
        for (int i = 1; i < n; i++) {
            numbers.removeIf(each -> Collections.max(numbers) == each);
        }
        return Collections.max(numbers);
    }
}
