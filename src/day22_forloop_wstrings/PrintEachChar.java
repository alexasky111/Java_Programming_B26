package day22_forloop_wstrings;

public class PrintEachChar {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("With loop");
        for(int i = 0; i < s.length(); i++ ) {// i <= s.length()-1

            System.out.println(s.charAt(i));
        } // i < s.length() --> i < 4
        // i <= s.length() - 1 --> i <= 3

    }
}
