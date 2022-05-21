package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLoopingWithIterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,34,6,7,8,3,8,8,1,9,4,9));

//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) < 5){
//                list.remove(i);
//            }
//        }
        //next() taking a pin and moving it, going one method at a time
        Iterator<Integer> it = list.iterator();

        while (it.hasNext())//checking if there is an element next to it, it'll keep running the loop
        {
            if(it.next() < 5){
                it.remove(); //removing the element from the list
            }
        }

        System.out.println(list);
    }
}
