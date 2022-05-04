package saims_practices_for_loopsArrayMethod;

public class Anagram {
    public static void main(String[] args) {

        /*
        Task 04 : Anagram
                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent  -->
                    funeral vs  real fun
                    a gentleman vs elegant man
                 -> anagram
                 Hint: look up and use replaceFirst() method
         */

        String str = "funeral";
        String str1 = "real fun";
        String output = "";
        str1 = str1.replaceFirst(" ", "");

        if (str.length() == str1.length()) {

            for (int i = 0; i < str.length(); i++) {

                if (str.contains(str.charAt(i) + "")) {
                    str1 = str1.replaceFirst(str.charAt(i) + "", "*");

                    output += str.charAt(i);
                }

            }
        }
        System.out.println(str1);
       if (output.equals(str)){
         output = "Anagram";

       } else {
          output = "Not Anagram";
       }
        System.out.println(output);
    }
}