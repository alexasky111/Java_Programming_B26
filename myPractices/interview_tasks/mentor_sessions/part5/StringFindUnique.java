package interview_tasks.mentor_sessions.part5;

public class StringFindUnique {
    /*
4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(findUnique(str));
    }

    public static String findUnique(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
