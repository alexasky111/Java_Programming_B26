package day39_arrayList_continue;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);
        System.out.println("Now I clear");
        nums.clear();

        System.out.println(nums);
        System.out.println(nums.size()); //returns int
        System.out.println(nums.isEmpty()); // returns boolean
    }
}
