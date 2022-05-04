package day38_arrayList;

import java.util.ArrayList;

public class P01_ArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Strings
add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
         */
        ArrayList<String> elements = new ArrayList<>();

        elements.add("Hat");
        elements.add("Shoes");
        elements.add(1,"Jacket");
        elements.add(0,"Towel");
        elements.add(1,"Car");
        System.out.println(elements);
    }
}
