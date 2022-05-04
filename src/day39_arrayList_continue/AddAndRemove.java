package day39_arrayList_continue;

import java.util.ArrayList;

public class AddAndRemove {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("comp");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0);
        //removes the 1st index of the ArrayList which is (computer) and it returns that element(computer) from the method.
        System.out.println(item);
        System.out.println(list);

        //This method returns boolean
        boolean bool = list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);
    }

}
