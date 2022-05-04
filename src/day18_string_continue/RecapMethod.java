package day18_string_continue;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen"; // s is a String literal, so it is in the String pool
        String s2 = new String("pen"); // s2 is object in the heap, because we used new

        System.out.println("Compare with == " + (s == s2)); // still compares objects and they are 2 different objects
        System.out.println("Compare with .equals() " + s.equals(s2)); // compares only values now bc of the method

        System.out.println("compare with .equals() " + s.equals("Pen")); // compares values now but 2nd value is w/ capital P
        System.out.println("compare with .equalsIgnoreCase() " +s.equalsIgnoreCase("Pen")); //ignores case

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){ // if value from the top "s" equals string -> "pen", then count the length

        }

        int len = s.length(); // true, the length is 3 characters
        System.out.println(len);

        System.out.println(s.length());

        // int a = 9;
        // a.length() -> invalid
        // a.equals() -> invalid

        if(s.length() > 4){
            System.out.println("long word"); // if there are > 4 characters in the top value "s" -> print "long word"
        } else {
            System.out.println("short word"); // if less -> print "short word"
        }

        System.out.println(("aaaa").length()); // you don't have to assign it can be hardcoded -> there are 4 characters
        System.out.println(("aa aa").length()); //-> there are 4 characters


}
}
