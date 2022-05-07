package interview_tasks.nadirs_interview;

public class NadirTaskPassword {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "ABC";
        String legitPassword = "Alex111a";

        System.out.println(equalString(str, str1));
        System.out.println(checkPassword(legitPassword));

    }

    public static boolean equalString(String str, String str1) {
        return str.equalsIgnoreCase(str1);
    }

    public static boolean checkPassword(String str) {

        if (str.length() > 3 && str.length() < 16) {
            if (Character.isLetter(str.charAt(str.length() - 1))) {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (Character.isDigit(ch)) {
                        return true;
                    }
                }
            }


        }
        return false;
    }


}


