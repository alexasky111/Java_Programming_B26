package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //1. To create an Array List
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList<Double> numbers1 = new ArrayList<>();
        ArrayList<Long> numbers2 = new ArrayList<>();
        ArrayList<Float> numbers3 = new ArrayList<>();

        //2. For printing Array List just normal printing
        System.out.println(numbers);

        // add/assign to an array [index] = value

        numbers.add(100); //adds 100 to the end of Array List
        System.out.println(numbers);

        numbers.add(-100); //adds -100 to the end of Array List
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        numbers.add(55);
        System.out.println(numbers);

        //in array how do we access wach element: arr [index]
        System.out.println(numbers.get(0)); //1st element in the list
        System.out.println(numbers.get(1)); //2nd element in the list
        //System.out.println(numbers.get(30)); --> OutOfBounds

        //How do you know how many elements are in the array: arr.length
        // is length a method --> no

        System.out.println(numbers.size()); // How many elements in the Array List

    }
}
