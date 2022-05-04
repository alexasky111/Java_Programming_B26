package day37_wrapper_arraylist;

public class WrapperClass_Task01 {
    public static void main(String[] args) {
        /*
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
         */
        System.out.println(WrapperClass_Task01.isEqual("JAVA java"));


    }
    public static boolean isEqual(String str) {

        int upper = 0;
        int lower = 0;
        int other =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            } else if (Character.isLowerCase(ch)){
                lower++;
            } else {
                other++;
            }

        }
        if (upper==lower) {
            return true;
        }
        return false;


    }
}
