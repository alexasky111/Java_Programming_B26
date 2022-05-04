package day15_04_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilty {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, -5, 0, -1, 30, 20, 20, 20));


        // sort()    : sort the given collection
        System.out.println("---sort()---");
        Collections.sort(numbers);
        System.out.println(numbers);

        // reverse() : reverse the order of the elements in given collection
        System.out.println("---reverse()---");
        Collections.reverse(numbers);
        System.out.println(numbers);

        // max()     : returns the biggest element
        System.out.println("---max()---");
        Collections.max(numbers);
        System.out.println(numbers);
        /*
        Find 2nd max num from ArrayList
         */
        numbers.removeIf(each->Collections.max(numbers)==each); //it will remove 1st max value in arraylist
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

        // min()     : returns the smallest element
        System.out.println("---min()---");
        Collections.min(numbers);
        System.out.println(numbers);

        // swap()    : swap the elements in the collection with their indexes
        System.out.println("---swap()---");
        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers);

        // frequency(c,o):
        System.out.println("---swap()---");
        int frequency = Collections.frequency(numbers,10);
        System.out.println(frequency);

        //c – the collection in which to determine the frequency of o
        //o – the object whose frequency is to be determined
    }
}
