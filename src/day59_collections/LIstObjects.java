package day59_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LIstObjects {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();//ref of the interface List(polymorphism), but the object is ArrayList object
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));


        List<String> list2 = new LinkedList<>();//ref of the interface List, but the obj is LinkedList obj
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));


        List<String>list3 = new Vector<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list3);
        System.out.println(list3.get(3));

    }
}
