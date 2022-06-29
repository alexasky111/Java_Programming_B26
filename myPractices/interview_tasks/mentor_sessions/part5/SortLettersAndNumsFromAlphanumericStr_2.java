package interview_tasks.mentor_sessions.part5;

import java.util.Arrays;

public class SortLettersAndNumsFromAlphanumericStr_2 {

    public static void main(String[] args) {
        String input = "DC501GCCCA098911";
        System.out.println("sortAlphanumericStr(input) = " + sortAlphanumericStr(input));
    }

    public static String sortAlphanumericStr(String str) {

        String digits = "";
        String letters = "";
        String allSorted = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
                char[] arr = letters.toCharArray();
                Arrays.sort(arr);
                allSorted += Arrays.toString(arr);
                letters = "";

            } else {

                letters += str.charAt(i);
                char[] arr = digits.toCharArray();
                Arrays.sort(arr);
                allSorted += Arrays.toString(arr);
                digits = "";
            }
        }

        char[] letter = letters.toCharArray();
        Arrays.sort(letter);
        char[] number = digits.toCharArray();
        Arrays.sort(number);
        return (allSorted + Arrays.toString(letter) + Arrays.toString(number)).replace("[", "").replace("]", "").replace(", ", ""); //CD015ACCCG011899
    }
}
    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

