package saims_practices_for_loopsArrayMethod;

import java.util.Arrays;

public class Task02_Arrays2 {
    public static void main(String[] args) {
       /*

URL Parts

Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
_____________________________
        */
        String url = "https://learn.cydeo.com/courses/130";
        String [] urlArr = url.split("/");
        System.out.println(Arrays.toString(urlArr));

        for (int i = 0; i < urlArr.length; i++) {
            System.out.println(urlArr[i]);

        }







    }
}
