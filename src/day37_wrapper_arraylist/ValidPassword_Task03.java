package day37_wrapper_arraylist;

public class ValidPassword_Task03 {
    public static boolean isValid(String str) {
        /*
        Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *
         */
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.length() >= 8){
                if (Character.isUpperCase(ch)){
                    upper++;
                } else if (Character.isLowerCase(ch)){
                    lower++;
                } else if (Character.isDigit(ch)){
                    digit++;
                    //	! @ # $ % ^ & *
                } else if (str.contains("!") || str.contains("@") || str.contains("#") || str.contains("$") || str.contains("%") || str.contains("^") || str.contains("&") || str.contains("*")){
                    special++;
                }
            }

        } if (upper>=1 && lower>=1 && digit>=1 && special>=1){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(ValidPassword_Task03.isValid("1loveUkraine!"));
    }
}

