package interview_tasks.mentor_sessions;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "ILoveUkraine!22";
        System.out.println(verifyPassword(password));

    }
    /*
    Write a return method that can verify if a password is valid or not. Requirements:
1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */
    public static boolean verifyPassword(String password) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpecialChar = 0;
        int countDigit = 0;

        if (password.length() >= 6 && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                    countUpperCase++;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                    countLowerCase++;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if(password.charAt(i)>=33 && password.charAt(i)<=41){
                    countSpecialChar++;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if(Character.isDigit(password.charAt(i))){
                    countDigit++;
                }
            }

        }
        return countUpperCase > 0 && countLowerCase > 0 && countSpecialChar > 0 && countDigit > 0;
    }
}
