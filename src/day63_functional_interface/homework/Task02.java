package day63_functional_interface.homework;

import day18_string_continue.contains;
import day54_abstraction.creating.Create;

import java.util.function.Function;

public class Task02 {
    public static void main(String[] args) {
        /* Use Predicate Functional interface to:
        1.1 Create a function that can verify if a number contains duplicate digits
        */
        int number = 12313;

        Function<Integer, Boolean> containsDuplicate = (n) -> {
            String str = Integer.toString(n);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
            }
            return count > 1;

        };
        System.out.println(containsDuplicate.apply(number));

        /* 1.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        + Password must be at least have 8 characters long, and should not contain space
        Password should at least contain one upper case letter
        Password should at least contain one lower case letter
        Password should at least contain one special characters
        Password should at least contain a digit
        */
        String str1 = "1loveUkraine!";

        Function<String, Boolean> ifStrongPass = (str) -> {
            int countLower = 0;
            int countUpper = 0;
            int countDigits = 0;
            int countSpecial = 0;

            if (str.length() >= 8 && !str.contains(" ")) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                        countLower++;
                    }
                }

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                        countUpper++;
                    }
                }

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        countDigits++;
                    }
                }

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 33 && str.charAt(i) <= 41) {
                        countSpecial++;
                    }
                }

            }
            return (countDigits > 0 && countLower > 0 && countUpper > 0 && countSpecial > 0);

        };

        System.out.println(ifStrongPass.apply(str1));

    }
}
