package Interview_Questions;

public class UniqueCharacters_IQ {
    public static void main(String[] args) {
        /*
[IQ] Unique characters
Given a String, find and print the unique characters. A character is unique if it only appears once in the String.
Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique
 */
        String str = "AAABCCDEEFYZZ";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i); //storing each character from the string
            int count = 0; // counting approach

            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j); // not helping w/ a code just to see better
//                System.out.println(eachLetter + " - " + inner);
                if (letter == inner) {
                    count++;
                }
            }
            if (count == 1) { // the counter will be one when the character was unique; he char will always match w/ itself one time, so it will never be 0, but if the counter value is more than 1, than that char matched w/ multiple other char, which means it is not unique
                System.out.print(letter); //---> the variable is ALWAYS from the outer loop, because inner variable belongs to the inner loop only!!!
            }

        }


    }
}
