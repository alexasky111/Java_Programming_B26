package day08_06_2022;

import java.util.*;

public class P02_Reverse {
    /*
    Task 02 ; Reverse a given String by using any data structure
     */
    public static void main(String[] args) {
        String word = "javajava";
        System.out.println(reverse1(word));
        System.out.println(reverse2(word));
        System.out.println(reverse3(word));
    }

    //String manipulations
    public static String reverse1(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    //Collections reverse method
    public static String reverse2(String str){

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String reversed = "";
        Collections.reverse(list);
        reversed = list.toString().replace("[","").replace("]","").replace(", ","");

        return reversed;
    }

    public static String reverse3(String str){
        String reversed = "";

        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(str.split("")));
        //pop() -> deletes the last elements, returns too
        for (int i = 0; i < str.length(); i++) {
            reversed +=stack.pop();
        }
        return reversed;
    }
}
