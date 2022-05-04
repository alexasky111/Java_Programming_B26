package repractice_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice01 {
    /*
    write a method that will accept 2 arr strings and return a boolean true if a name contains nadir and if password starts with numbers
     */
    public static void main(String[] args) {
        String[] userName = {"nadir", "saim", "alexandra", "abcnadirabc"};
        String[] password = {"123kfjdk", "jahd123", "1jdhf", "yeruh123"};

        System.out.println(correctUser(userName, password));
        System.out.println(printCorrectUserAndPass(userName, password));

        System.out.println(Arrays.toString(returnNewStrArr(userName, password)));


    }

    static public boolean correctUser(String[] userName, String[] password) {

        for (String each : userName) {
            if (each.contains("nadir")) {
                for (int i = 0; i < password.length; i++) {
                    char ch = password[i].charAt(0);
                    if (Character.isDigit(ch)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    static public ArrayList<String> printCorrectUserAndPass(String[] userName, String[] password) {
        ArrayList<String> matched = new ArrayList<>();

        for (String each : userName) {
            if (each.contains("nadir")) {
                matched.add(each);
                for (int i = 0; i < password.length; i++) {
                    char ch = password[i].charAt(0);
                    if (Character.isDigit(ch)) {
                        matched.add(password[i]);
                    }
                }
                return matched;

            }

        }
        return matched;
    }

    static public String[] returnNewStrArr(String[] userName, String[] password) {

        String[] fixed = new String[userName.length + password.length];
        for (int i = 0; i < userName.length; i++) {
            if (userName[i].contains("nadir")) {
                fixed[i] = userName[i];
                for (int j = 0; j < password.length; j++) {
                    char ch = password[j].charAt(0);
                    if (Character.isDigit(ch)) {
                        fixed[i] = password[j];
                    }
                }
                return fixed;
            }

        }
        return fixed;
    }
}


