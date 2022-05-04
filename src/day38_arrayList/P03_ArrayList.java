package day38_arrayList;

import java.util.ArrayList;

public class P03_ArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters
         */
        ArrayList<Character> upperCase = new ArrayList<>();
        // 1. Change the initialization to char and use the add() method w/ an Array List
        for (char i = 'A'; i <= 'Z' ; i++) {
           upperCase.add(i);
        }
        System.out.println(upperCase);
    }
}
