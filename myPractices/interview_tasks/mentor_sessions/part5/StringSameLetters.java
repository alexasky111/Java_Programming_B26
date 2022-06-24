package interview_tasks.mentor_sessions.part5;

public class StringSameLetters {
    /*
    String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {
        String str1 = "acba";
        String str2 = "caba";

        System.out.println(containsSameLetters(str1, str2));
    }

    public static boolean containsSameLetters(String str1, String str2) {

        //1- Check if both strings are the same length
        if (str1.length() == str2.length()) {
            //2- Loop through the 1st str and check if any of its elements are in the 2nd str
            for (int i = 0; i < str1.length(); i++) {
                //3- if yes - modify the 2nd str by replacing those elements w/ ""
                if (str2.contains(str1.charAt(i) + "")) {
                    str2 = str2.replaceFirst(str1.charAt(i) + "", "");
                } else {
                    //in case an element is not in the str2 return false right away
                    return false;
                }
            }
        } else {
            //in case strings are different length
            return false;
        }
        //if 2nd str is empty it means: all the elements matched with the elements of 1st str and have been replace by ""
        return str2.isEmpty();
    }
}
