package day39_arrayList_continue;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

//        nums.remove(500); --> not valid go out of bounds
        Integer i = 500; // you have to give Object to Array List
        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200)); //removes element-200 as an Object bc of valueOf return type
        System.out.println(nums);

        nums.remove((Integer)800 ); //
        System.out.println(nums);


    }

}
