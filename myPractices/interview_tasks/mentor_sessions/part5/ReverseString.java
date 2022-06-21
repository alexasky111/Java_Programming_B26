package interview_tasks.mentor_sessions.part5;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        reverseString(str);
        reverseStringBuilder(str);
    }


    public static void reverseString(String str) {

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println(res);
    }

    public static void reverseStringBuilder(String str) {

        StringBuilder res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }
        /* 5.    String - Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */
}
