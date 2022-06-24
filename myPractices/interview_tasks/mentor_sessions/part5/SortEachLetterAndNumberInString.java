package interview_tasks.mentor_sessions.part5;

import java.util.ArrayList;
import java.util.Arrays;

public class SortEachLetterAndNumberInString {
    public static void main(String[] args) {
        String str = "1DC501GCCCA098911a";
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        String temp = "";
        ArrayList<String> output = new ArrayList<>();

        //Splitting the string into smaller parts, each being a group of digits or letters, and then putting each
        // group as an element into ArrayList<String> output
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) || Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))) {
                temp += str.charAt(i) + "";
            } else {
                temp += str.charAt(i) + "";
                output.add(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) {
            if ((Character.isDigit(temp.charAt(0)) && Character.isDigit(str.charAt(str.length() - 1))) || (Character.isLetter(temp.charAt(0)) && Character.isLetter(str.charAt(str.length() - 1)))) {
                temp += str.charAt(str.length() - 1) + "";
                output.add(temp);
            } else {
                output.add(str.charAt(str.length() - 1) + "");
            }
        } else {
            output.add(str.charAt(str.length() - 1) + "");
        }

        //Below is sorting of each element of the ArrayList <String> output into an ArrayList<String> finalOutput
        // with each element sorted
        ArrayList<String> finalOutput = new ArrayList<>();
        for (int i = 0; i < output.size(); i++) {
            String[] arrToSort = (output.get(i).split(""));
            Arrays.sort(arrToSort);
            String tempStr = "";
            for (int j = 0; j < arrToSort.length; j++) {
                tempStr += arrToSort[j];
            }
            finalOutput.add(tempStr);

        }

        //Below is converting the ArrayList <String> finalOutput into a String to produce the method's output in a
        // String format
        String outputStr = "";
        for (String each : finalOutput) {
            outputStr += each + "";
        }


        return outputStr;
    }

}
//1CD015ACCCG011899a
    /*
    Create a method that will take any String of letters and numbers and sort
each substring of numbers and letters
Ex:
Input:"DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */


