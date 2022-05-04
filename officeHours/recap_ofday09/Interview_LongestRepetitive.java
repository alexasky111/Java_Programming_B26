package recap_ofday09;

import java.util.Arrays;

public class Interview_LongestRepetitive {
    public static void main(String[] args) {
        /*
        Longest Repetitive Substring
    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef

    					   str ="abcdefabcdef abcdefabcdef"    output should be abcdefabcdef
    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"
         */

        String word = "abcdefabcdefabcdefabcdef";
        String longest = "";

        // 1. To check if a string is repetitive - split the String by repetitive characters
        String[] split = word.split("abcdef");

        //2. To check how many characters in the Array split
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));

        //3. To loop through to see if we have repetitive substring
        String temp = "";
        for (int i = 0; i < word.length()/2; i++) { // can do without /2
            temp +=word.charAt(i);

        //4. We have new Array based on our temp
            String[] split1 = word.split(temp);
//            System.out.println(Arrays.toString(split1));

        //5. To see which is the longest
            if(split1.length == 0 && longest.length()<temp.length()){
              longest=temp;
            }

        }
        //6. To handle when there is no repetitive in an Array
        System.out.println(!longest.isEmpty()?longest: "There is no repetitive");


    }
}
