package day35_return_method;

public class frequencyOfChar {
    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
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
}

