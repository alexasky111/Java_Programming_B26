package day22_forloop_wstrings;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        repeated steps -> ask a user to enter the item; add item to shopp list; ask if they want to add more; show the full shop list
         */
        Scanner sc = new Scanner(System.in);
        String list = "----Shopping List----";
        String addMore = "";

        do {
            System.out.println("Enter the name of the item");
            list += "\n*" + sc.nextLine(); // I get scanner input from the counsel
            System.out.println("Do you want to add more to your shopping list? ");
            addMore = sc.nextLine();
        } while (addMore.equalsIgnoreCase("yes"));
        //if the user types "yes" in the console about wanting to add more items than the loop will iterate again
        // if the user types anything else -> the equals method will give false and the loop stops
        System.out.println(list);







    }

}
