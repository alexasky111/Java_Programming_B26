package day38_arrayList;

import java.util.ArrayList;

public class P04_ArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
         */
        ArrayList<Character> lowerCase = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            lowerCase.add(i);

        }
        System.out.println(lowerCase);
        System.out.println("================================");
     lowerCase.remove(0);
     lowerCase.remove(3);
     lowerCase.remove(6);
     lowerCase.remove(11);
     lowerCase.remove(16);
        System.out.println(lowerCase);
    }
}
