package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeArrayListSaimTasks {
    public static void main(String[] args) {
        /*
        Reverse All
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));
        /*
        Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
         */
        //The method accepts a String ArrayList, so we created a summed String ArrayList
        ArrayList<String> summed = new ArrayList<>(Arrays.asList("123", "34", "513"));
        //The method returns Integer Array List summed, so we created an Integer Array List in the method numbersToSum()
        System.out.println(numbersToSum(summed));
        /*
        Create a method that will accept an Integer ArrayList and check for
bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then
the
second number. Remove any bad pairs for the ArrayList and return
the
ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of
elements, so each number always has one pair
@param nums - Given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {3, 4, 6, 1, 1, 10, 8, 7};
Output: {3, 4, 1, 10};
Bad pairs that were removed:
6, 1
8, 7
         */
        ArrayList<Integer> pairs = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(removeBadPairs(pairs));
        /*
        Count Letters
Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(numOfCh(words, 'a'));
        /*
        All Palindrome
Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity
Ex:
Input:
"Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
Anna, Racecar, Level, Eye
         */
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(str));
        /*
        Remove Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings
@param int - max number of characters
@return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
Max number: 4
Output: {“three, “four”, “five”
         */
        ArrayList<String> str1 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(strWithCorrectSize(str1, 4));
        /*
        Remove Countries
Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
         */
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(countriesWithCorrectSize(countries));
        /*
        Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
         */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));

    }

    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        /* ANOTHER APPROACH WITHOUT ArrayList.add() method
        public static ArrayList<String> reversed(ArrayList<String> words){

        for (int i = 0; i < words.size(); i++) {
            String word = "";
            for (int j = words.get(i).length() - 1; j >= 0 ; j--) {
                word += words.get(i).charAt(j);
            }
            words.set(i, word);
        }
        return words;
    }
         */
        //1. To create a new Array List to work with
        ArrayList<String> str = new ArrayList<>();
        //2. To go through the Array list in the parameter
        for (String s : list) {
            //3. To add all the reversed elements of each string in an Array List into new Strings
            String reversed = "";
            //4. To collect all the letter from each String element into new String reversed
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            //5. To add all new reversed Strings into a new ArrayList
            str.add(reversed);
        }
        return str;
    }

    public static ArrayList<Integer> numbersToSum(ArrayList<String> str) {
        // 1. To create a new ArrayList that will return all the sums of numbers
        ArrayList<Integer> summed = new ArrayList<>();
        // 2. To go through an Array List in the parameter
        for (String s : str) {
            // 3. To create a variable where all the sums will be included
            Integer sum = 0;
            // 4. To loop through each number in each s
            for (int j = 0; j < s.length(); j++) {
                String numbers = s.charAt(j) + "";
                // 5. To convert String numbers into int numbers
                Integer nums = Integer.valueOf(numbers);
                // 6. To add all the nums into Integer sum
                sum += nums;
            }
            summed.add(sum);
        }
        return summed;
    }

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> numbers) {
        ArrayList<Integer> fixed = new ArrayList<>();

//        ArrayList<Integer> pairs = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        //1. To go through each pair in the Array List and check one pair at the time, not one element, but a pair ==> i+=2
        for (int i = 0; i < numbers.size() - 1; i += 2) {
            //2. To create variables that will hold the 1st element in the pair=num1, and the 2nd element in the pair=num2
            int num1 = numbers.get(i);
            int num2 = numbers.get(i + 1);
            //3. To check for bad Pairs, if each 1st element in the pair=num1 is smaller than 2nd element in the pair=num2, then good Pair
            if (num1 < num2) {
                //4. To add all good pairs to the new Array List
                fixed.addAll(Arrays.asList(num1, num2));
            }
        }
        return fixed;
    }

    public static int numOfCh(ArrayList<String> str, char ch) {

        int count = 0;
        //1. To go through the whole Array List
        for (String s : str) {
            //2. To go through each element of each String in the Array List
            for (int i = 0; i < s.length(); i++) {
                //3. To check if the element equals char in the parameter
                if (s.charAt(i) == ch) {
                    //4. To fix the occurrence of the char
                    count++;
                }
            }

        }
        return count;
    }

    public static ArrayList<String> allPalindrome(ArrayList<String> words) {
        ArrayList<String> palindrome = new ArrayList<>();
        // 1. To go through all the elements in the ArrayList first
        for (String each : words) {
            //2. To have a variable that will collect the reversed order of each String in the ArrayList
            String reversed = "";
            //3. To start reversing each String in the ArrayList
            for (int i = each.length() - 1; i >= 0; i--) {
                //4. Collecting each reversed character in the Strings
                reversed += each.charAt(i);
            }
            //4. To check if the characters in each reversed String equals each original String
            if (each.equalsIgnoreCase(reversed)) {
                //5. Collect the ones that equal bc they are palindrome
                palindrome.add(each);
            }
        }
        return palindrome;
    }

    public static ArrayList<String> strWithCorrectSize(ArrayList<String> words, int size) {
        ArrayList<String> str = new ArrayList<>();
        //1. To go through each String in the ArrayList
        for (int i = 0; i < words.size(); i++) {
            //2. To check the size of each String in the ArrayList if it equals or more the int in the parameter, then add to a newArrayList
            if (words.get(i).length() >= size) {
                str.add(words.get(i));
            }
        }
        return str;

    }

    public static ArrayList<String> countriesWithCorrectSize(ArrayList<String> words) {
        ArrayList<String> str = new ArrayList<>();
        for (String each : words) {
            if (each.length() < 7) {
                str.add(each);
            }
        }
        return str;
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {
        ArrayList<Integer> nonDuplicates = new ArrayList<Integer>();
        //1. To go through each number in the ArrayList
        for (int i = 0; i < nums.size(); i++) {
            int count = 0; // --> to have a variable to count the occurrence
        //2. To have another loop that will match each number with each element in the ArrayList
            for (int j = 0; j < nums.size(); j++) {
                //3. If the match is found it'll count
                if (nums.get(i) == nums.get(j)) {
                    count++;
                }

            }
            //4. To collect only unique numbers in the array by checking the occurrence count == 1
            if (count == 1) {
                nonDuplicates.add(nums.get(i));
            }


        }
        return nonDuplicates;
    }
}





