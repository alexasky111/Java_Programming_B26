package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String s = "ABCD123$%#@&456EFG!";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);
        ArrayList<String> numbers = new ArrayList<>(list); //using as a starting point
        numbers.retainAll(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        System.out.println(numbers); // --> All numbers will be remained the rest of chars deleted
        ArrayList<String> specialChars = new ArrayList<>(list); // --> All special chars will be remained the rest of chars deleted
        specialChars.retainAll(Arrays.asList("!","@","#","$","%","^","&","*","(",")","~"));
        System.out.println(specialChars);

        ArrayList<String> letters = new ArrayList<>(list); // AsList method accepts an array
        letters.removeAll(numbers); // these methods accepts an ArrayList
        letters.removeAll(specialChars);
        System.out.println(letters);



    }
}
