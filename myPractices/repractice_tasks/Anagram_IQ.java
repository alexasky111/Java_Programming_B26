package repractice_tasks;

import java.util.Locale;

public class Anagram_IQ {
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
//        String [] str = new String [] {"one", "two", "three"};
        String str1 = "listen vs silent";
        String str2 = "listen vs silent";

        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                str2 = str2.replace(ch+"", "");
            }
            if(str2.isEmpty()){
                System.out.println("anagram");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("not anagram");
        }

        }
    }
