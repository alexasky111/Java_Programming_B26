package day29_05_31_2022;

import com.sun.source.tree.Tree;
import day55_polymorphism.clothes.HasHood;

import java.util.*;

public class T02_SetPractice {
    public static void main(String[] args) {


        String[] browsers = {"Chrome", "Firefox", "Chrome", "Edge", "IE", "Edge"};
        Set<String> hasSet = new HashSet<>(Arrays.asList(browsers));
        hasSet.add(null);
        System.out.println(hasSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(browsers));
        linkedHashSet.add(null);
        System.out.println("strings = " + linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(browsers));
        System.out.println(treeSet);
        //treeSet.add(null); --> it doesn't accept null values
        System.out.println(treeSet);

        Integer[] a = {1,2,3,44,3,5,67,43,76,90,6,8,8,2,1};

        //Remove duplicates from all

        //Keep insertion order
        System.out.println(new LinkedHashSet<>(Arrays.asList(a)));
        // return 5th element after remove
        System.out.println(new ArrayList<>(new LinkedHashSet<>(Arrays.asList(a))).get(4));
        //sort in ascending order
        System.out.println(new TreeSet<>(Arrays.asList(a)));
        //sort in descending order
        ArrayList<Integer> sortedList = new ArrayList<>(new TreeSet<>(Arrays.asList(a)));
        Collections.reverse(sortedList);
        System.out.println(sortedList);
    }
}