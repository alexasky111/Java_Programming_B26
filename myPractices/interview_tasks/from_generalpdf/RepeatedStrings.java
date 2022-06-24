package interview_tasks.from_generalpdf;

public class RepeatedStrings {

    public static void main(String[] args) {
        String atr = "aba";
        System.out.println(repeatedString(atr, 10));
    }

    public static long repeatedString(String s, long n) {

        for (int i = 0; i < n; i++) {
            s += s;
            System.out.println(s);
        }


        String output = "";

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                output += s.charAt(i);
            }
        }

        return output.length();
    }
}
/*
There is a string s, of lowercase English letters that is repeated infinitely many times. Given an integer n, find and print the number of letter a's in the first n letters of the infinite string.

Example
s = 'abcac'
n = 10

The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are 4 occurrences of a in the substring.
 */

