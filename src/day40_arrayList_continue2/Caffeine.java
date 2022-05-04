package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);

        // 2. If I had an array list I can basically copy it in a new ArrayList
        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        // 1. To make a String arr
        String [] allDrinks = {"coffee", "tea", "energy drinks", "soda"};
//        ArrayList<String> drinks3 = new ArrayList<>(allDrinks); --> not valid bc Array is not a valid argument
        // 2. A valid option that works, but I can also give values right away without creating a separate Array
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);
        // 3. To give values right away without creating a separate Array
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drinks", "soda"));
        System.out.println(drinks4);

        ArrayList<String> drinks5 = new  ArrayList<>(); // creating an object
        drinks5.addAll(Arrays.asList("coffee", "tea", "energy drinks", "soda")); // using a method; for ArrayList.addAll() we need a collection type to use!
        System.out.println(drinks5);
    }
}
