package day36_overloading_method;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] arr = {12, 5, 1, 2, 6, 5};
        String[] words = {"java", "apple", "water", "hello"};
        System.out.println(indexOf(words, "hello"));

        System.out.println(indexOf(arr, 2)); // Returns the index of number 2 is 1, not the number itself, its index 1 in the Array
        System.out.println(indexOf(arr, 20));
        System.out.println(indexOf(arr, 5));
    }

    // IndexOf is a String Method, it has functionality --> indexOf is not only a name of the method

    public static int indexOf(String[] str, String element) {
        // Second version of the method indexOf
        for (int i = 0; i < str.length; i++) {
        //strings can't be compared w/ == sign
            if (str[i].equals(element)) {
                return i;
            }

        }
        return -1;
    }

    public static int indexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            // 1. I am trying to find an element through the Array; If multiple it returns the 1st occurance of the number
            if (nums[i] == element) {
            // 2. if we found a match we return i
                return i;
            }

        }   // 3. if we don't find a match we'd return -1
        return -1;
    }
}
