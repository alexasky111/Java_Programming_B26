package Interview_Questions;

import java.util.Arrays;
import java.util.Locale;

public class Longest_Repetitive_Array_IQ {
    public static void main(String[] args) {
            /*


    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

            For Example is str ="abcababcababcab"                 output should be abcab
                           str ="abcdefabcdef"                    output should be abcdef

                           str ="abcdefabcdefabcdefabcdef"    output should be abcdefabcdef
                           str ="abcdefxabcdef"                   output should be "There is no repetitive substring"

         */

        String word = "abcdefabcdefabcdefabcdef";
        String [] split = word.split("a");
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));

        String temp = "";
        String longest = "";
        for (int i = 0; i < word.length()/2; i++) { // if we have repetitive substring

//            temp += word.charAt(i);
            temp = word.substring(0, i+1);
            String[] s = word.split(temp); //we have new array based on our temp
//            System.out.println(Arrays.toString(s));

            if(s.length==0) {
                System.out.println(temp);
                if (s.length==0 && longest.length()<temp.length()){
                    longest=temp;
                }
            }
            System.out.println( !longest.isEmpty() ? longest : "There is no repetitive" );
            //There is no repetitive substring

        }



    }
}
