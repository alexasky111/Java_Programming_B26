package day40_arrayList_continue2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,67,22,230,12));

        //1. Arrays and collections: I have an dArrayList not an array, so can't use the arr.sort()
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A','B','C','D'));
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.max(list)); // To find the biggest number and print it
        System.out.println(Collections.max(list)); // To find the smallest number and print it
        Collections.swap(letters, 0, 3); // To swap the positions of the elements in the ArrayList
        System.out.println(letters);

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11,11,20,11,30));
        int num = Collections.frequency(numbers, 11); //how many times an element is in the ArrayList
        System.out.println(num);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","two","one"));
        System.out.println(Collections.frequency(words, "one"));

    }

}
