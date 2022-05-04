package day38_arrayList;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wind");
        System.out.println(list);
        list.remove(0); // just like str.charAt(i) - if we don't print, we don't get the return value; returns: water, sun, wind, wood
        System.out.println(list);
        System.out.println(list.remove(list.size()-1));
        // list.size()-1 --> last index
        // remove(last index) --> remove element: wood
        // prints the removed element : wood
        System.out.println(list); // [sun, wind]

        list.remove("sun");
        System.out.println(list); // [wind]
        System.out.println(list.remove("apple")); // return false because I don't have an element of "apple"
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);
        list.remove("light");
        System.out.println(list);
    }
}
