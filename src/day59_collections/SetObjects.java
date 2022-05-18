package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetObjects {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);
        //doesn't let duplicates, order is not maintained
        //no indexes

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello");
        set2.add("%");
        System.out.println(set2);


    }
}
