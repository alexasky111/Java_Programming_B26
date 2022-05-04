package day35_return_method;

import day37_wrapper_arraylist.ValidPassword_Task03;
import my_Utilities.StringUtil; // in my_Utilities package I am accessing my StringUtil Class

public class UsingStringUtil {
    public static void main(String[] args) {
        // 1. How do you call the method:
        // You must import to use different classes

        // Method 1
        System.out.println(StringUtil.reverse("apple"));
        // Method 2
        System.out.println(StringUtil.fixFormat("jaMES"));
        // Method 3
        System.out.println(StringUtil.frequencyOfChar("apple",'p'));
        //Method 4
        System.out.println(StringUtil.camelCase("I love Ukraine"));

        // Method 5
        System.out.println(StringUtil.uniqueCharacters("shjhhhhjjsdsjyy"));
        System.out.println(StringUtil.uniqueCharacters("eeebbbnnn"));
        // Method 6
        System.out.println(ValidPassword_Task03.isValid("1loveUkraine!"));
    }
}
