package day12_03_23_2022;

import java.util.Arrays;

public class Task03 {
    /*
      Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
     */
    public static void main(String[] args) {
        String input = "  Hello world      I      love      Java    "; // 1st prints this line, then checks the void method and comes back to Main Method

        removeSpace(input);
    }



    public static void removeSpace(String str){
        String [] s = str.trim().split(" ");
        System.out.println(Arrays.toString(s));
//        System.out.println(s[2].length()); to see we have empty String
        String result = "";
        for (String each: s) {
            if(!each.isEmpty()){
                result += each+" ";
            }

        }
        System.out.println(result);
    }
}
