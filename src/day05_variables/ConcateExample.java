package day05_variables;

import jdk.swing.interop.SwingInterOpUtils;

public class ConcateExample {
    public static void main(String[] args) {
        System.out.println(5+4);
        System.out.println(5+4+ "hello"); //int+int+string->9hello->STRING, int+int=>normal math, "hello"=>string type
        System.out.println("hello"+5+4);
        //String+int=> String type = hello5
        //hello5 (String) + 4(int) = hello54 (it'll concatenate the character not math)
        //If Concatenation starts w/ String it'll be a String, as soon as you get to the String that will be a string!
    }
}
