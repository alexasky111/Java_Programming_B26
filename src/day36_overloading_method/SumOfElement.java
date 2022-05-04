package day36_overloading_method;

public class SumOfElement {
    // Variable Argument - Array Parameters
    public static void main(String[] args) {
        int []arr = {1,3,6,2};
        System.out.println(sum(arr));

        System.out.println(sum(1,2,3,4,5)); // because of ... we can assign the numbers to the array right away without making an array first
    }
    public static int sum (int ... nums){
        int sum = 0;
        for (int each : nums) {
            sum += each;

        }
        return sum;
    }

//    NORMAL VERSION THAT WE KNOW
//    public static int sum (int [] nums){
//        int sum = 0;
//        for (int each : nums) {
//            sum += each;
//
//        }
//        return sum;
//    }
}
