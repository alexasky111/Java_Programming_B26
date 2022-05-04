package day38_arrayList;

import java.util.ArrayList;

public class Classroom2 {
    public static void main(String[] args) {
        ArrayList<String>group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group); // [Ziba]

        //Now "Victor" is at the position of 0
        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]
        group.add("Ozi"); // it'll add to the end [Victor, Ziba, Ozi]

        group.add(1, "James");
        System.out.println(group); //[Victor,James, Ziba, Ozi]
        System.out.println(group.add("Emre")); // add() --> method from return method; it returns boolean
    }
}
