package saims_practices_for_loopsArrayMethod;

public class NestedLoops_HW4 {
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
        String str = "AAABCCDEEF";
        String unique = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) { // here each letter 'A'
            for (int j = 0; j < str.length(); j++) { // match w/ string AAABCCDEEF
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count==1) {
                if (!unique.contains(""+str.charAt(i))) {
                    unique += str.charAt(i);
                }
            }
            count = 0;
        }
        System.out.println("Unique character of the given string are: "+ unique);

    }
}
