package interview_tasks.mentor_sessions.part5;

public class StringRemoveDuplicates {
    /*
    3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";

        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (!output.contains(str.charAt(i) + "")) {
                output += str.charAt(i) + "";
            }
        }
        return output;
    }
}
