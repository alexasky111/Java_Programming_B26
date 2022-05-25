package morning_practice.saims_recent_practices.maps_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,223,45,666,5,111,800));
        // list.removeIf(integer -> integer > 100);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
              it.remove();
            }
        }
        System.out.println(list);
    }


    /*
    Given an ArrayList of numbers, remove all the numbers more than 100
- Think about how many different ways you can do this
     */



}
