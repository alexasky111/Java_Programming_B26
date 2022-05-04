package day37_wrapper_arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HTML_generator_Task02 {
    public static void main(String[] args) {
        /*
HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^
	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
         */
        String str = "div^2";
        str = str.replace("^", " ");
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
//        String str1 = String.valueOf(arr[0]);
        int num = Integer.valueOf(arr[1]);

        for (int i = 0; i < num; i++) {
            System.out.print("<" + arr[0] + "></"+arr[0]+">");

        }


    }
}
