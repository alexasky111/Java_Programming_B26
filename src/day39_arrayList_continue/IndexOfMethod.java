package day39_arrayList_continue;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        //give first 100
        System.out.println(nums.indexOf(100)); //methods return a number

        System.out.println(nums.indexOf(700));

        //can also assign to a variable
        int i = nums.indexOf(200);
        System.out.println(i);

        //last 100
        System.out.println(nums.lastIndexOf(100));
        // middle 100
//        nums.remove((Integer)100);

        nums.set(nums.indexOf(100),0); //nums.(0,0);
        System.out.println(nums.indexOf(100));

        String str = "alex";


    }
}
