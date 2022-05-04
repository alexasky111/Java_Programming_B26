package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "Shopping List Empty" : "You have some items");
        String keepAsking;
        do {
            System.out.println("Enter the item ");
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue y/n");
            keepAsking = input.nextLine();

        } while (keepAsking.equals("yes") || keepAsking.equals("y"));

        System.out.println("Shopping List: " + shoppingList.size() + " items:");
        for(String item : shoppingList){
            System.out.println("*\t" + item);
        }
        System.out.println("----------------------------");

        System.out.println(shoppingList.contains("water") ? "Water on list" : "No water on the list");

        System.out.println("Do you want to remove any items?");
        if(input.nextLine().equals("yes")){
            System.out.println("What item do you want to remove");
            String removeItem = input.nextLine(); // this will either be an item name or the item number

            if(Character.isDigit(removeItem.charAt(0))){ // checks the first character of remove item, checks if it is a number
                int number =  Integer.parseInt(removeItem); // we convert the String into an int
                shoppingList.remove(number - 1); // converts the number to an index. If the user wants to remove the first item, they would give 1, so to remove the first index 1 - 1 = 0
            } else{
                shoppingList.remove(removeItem);
            }
        }

        System.out.println("Final List: " + shoppingList);

    }


}
