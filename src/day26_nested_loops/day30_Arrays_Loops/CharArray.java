package day26_nested_loops.day30_Arrays_Loops;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        //converting a String to a char []

        char [] java = word.toCharArray(); //--> the elements are characters
        // String method that is taking a String and converting all characters into a character Array

//        System.out.println(Arrays.toString(letters));


        //To print every letter in a String

        for (char eachChar : java){
            System.out.println(eachChar);
        }
        System.out.println(java[0]);

        //Convert a char array to a String

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length); // how many characters we have

        String strDay = new String(day); // WE MUST ASSIGN an Array to a String in order to use it || this is just a String not an Array
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
//        System.out.println(day.toUpperCase());   --->  Cannot use String methods on a char





    }
}
