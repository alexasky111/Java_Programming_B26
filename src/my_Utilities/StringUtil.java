package my_Utilities;

import jdk.jfr.Frequency;

public class StringUtil {

//Method 1
    public static String reverse(String str) {
        String reversed = "";

        // 1. To reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // 2. To return reversed String
        return reversed;
    }

// Method 2
         /*

Fix Format
create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

      */

    public static String fixFormat(String str){
                  //return type    //parameter
        str = str.trim();

        // 1. To pull 1st letter + concatenate w/ the rest of the str
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }


// Method 3
  /*  create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
    Ex:
    Input:
    aabbaacca, a

    Output:
            5
            -------------------------
            */
    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        //If my character in a String equals to the letter, than I count++; We are counting how many times the letter in the String
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                count++;
            }

        }
        return count;

    }

//Method 4
    /*
    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase
Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld
     */
    public static String camelCase(String str) {
        String str2 = str.toLowerCase();
        String camelCase = str2.substring(0,1);

        for (int i = 1; i < str2.length(); i++) {
            // To prevent out of bond issue
            if(str2.charAt(i-1) == ' '){
                camelCase += str2.substring(i, i+1).toUpperCase();
            } else {
                camelCase +=str2.charAt(i);
            }

        }
        return camelCase.replace(" ","");
    }

//Method 5
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
/*
    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i < str.length(); i++){

            if(!checked.contains("" + str.charAt(i))){
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if(count == 1){
                    unique += str.charAt(i);
                }
            }
        }

        return unique;
    }
 */

//Method 6
    /*
    Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		acef
     */
public static String duplicateChar(String str){
  String unique = "";

    for (int i = 0; i < str.length(); i++) {
        if(!unique.contains(""+str.charAt(i)) ) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            if (count>1){
                unique += str.charAt(i);
            }

        }

    }
    return unique;

}





}
