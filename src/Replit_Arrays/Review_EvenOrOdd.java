package Replit_Arrays;

public class Review_EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,9};
        int even = 0;
        int odd = 0;

//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//
//        }
//        System.out.println("even"+even+"\nodd"+odd);

String even1 = "";
String odd1 = "";

        for ( int num : nums) {
            if (num % 2 == 0) {
                even++;
                even1 += num+" ";
            } else {
                odd++;
                odd1 += num+" ";
            }

        }
        System.out.println(even1);
        System.out.println(odd1);










    }
}
