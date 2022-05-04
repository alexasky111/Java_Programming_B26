package repractice_tasks;

public class FindDuplicateChars_IQ {
    /*
    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates
         */
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        for (int i = 0,j=0; i < str.length(); i++,j++) {
            if(!str.contains(str.charAt(i)+"")){

            }
        }
    }

}
