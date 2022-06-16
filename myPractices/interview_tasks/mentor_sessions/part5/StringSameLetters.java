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
        String str2 = "cbba";

        System.out.println(containsSameLetters(str1, str2));
    }

    public static boolean containsSameLetters(String str1, String str2) {

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str2.contains(str1.charAt(i) + "")) {
                    str2 = str2.replaceFirst(str1.charAt(i) + "", "");
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        return str2.isEmpty();
    }
}
