package day38_arrayList;

import java.util.ArrayList;

public class P02_ArrayList {
    /*

Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Iron Man");
        elements.add("Spider Man");
        elements.add("Thor");
        elements.add("Captain America");
        elements.add("Hawkeye");
        System.out.println(elements);
        System.out.println("==================");
        elements.remove(2);
        System.out.println(elements);
        System.out.println("===================");
        elements.remove("Iron Man");
        System.out.println(elements);
        System.out.println("==================");
        elements.remove(0);
        System.out.println(elements);
    }


}
