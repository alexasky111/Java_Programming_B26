package day39_arrayList_continue;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100); //index 0
        nums.add(200); // 1
        nums.add(500); // 2
        nums.add(800); // 3

        nums.set(0,-100); //what do I want to change it to
        System.out.println(nums);

        nums.set(2, 5000);
        System.out.println(nums);

//        nums.set(10,700); --> goes out of bounds
    }
}
