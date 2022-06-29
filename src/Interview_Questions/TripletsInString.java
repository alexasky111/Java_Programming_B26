package Interview_Questions;

public class TripletsInString {

    /*
    We'll say that a "triple" in a string is a char appearing three times
 in a row. Print out the number of triples in the given string.
 The triples may overlap. Example:input: abcXXXabc output: 1
     */
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(findTriplets(str));
    }

    public static int findTriplets(String str) {

        int count = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
