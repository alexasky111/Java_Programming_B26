package Interview_Questions;

public class Duplicate_Task_IQ {
    public static void main(String[] args) {
        /*
Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates
         */
        String str = "AAABCCDEEF";
        String checked = ""; //if we checked a character or NOT
        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains("" + str.charAt(i))) {  // To avoid the duplicates printed all in the line, now each duplicate once
                int count = 0;
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.print(str.charAt(i));
                }
                checked += str.charAt(i); //
            }


        }


    }
}


