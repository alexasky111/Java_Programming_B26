package day35_return_method;

import my_Utilities.StringUtil;


public class UniqueCharWithMethod {
    /*
    Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		bd
     */
    public static String uniqueCharacters(String str){
        // 1. This str represents all the unique chars we'll have
        String unique = "";
        String checked = ""; // No need to count the same char 5 times, we can avoid by if statement

        for (int i = 0; i < str.length(); i++) {
            if(checked.contains(""+str.charAt(i))){
                continue;
            }

        // 2. How many times each character is found in the str (Return Type = int, so we assign in int)
            int count = StringUtil.frequencyOfChar(str, str.charAt(i));
            checked += str.charAt(i);

        // 3. To check if it's unique or not; If statement needs to be in the loop to check each character

            if(count==1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }
}
