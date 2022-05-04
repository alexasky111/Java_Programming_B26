package day35_return_method;

import my_Utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
// Method 1, 2
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(ArrayUtil.minNumber(a));
        System.out.println(ArrayUtil.maxNumber(a));
// Method 3
        System.out.println(ArrayUtil.contains(a, 12));
        System.out.println(ArrayUtil.contains(a, 5));

//Method 4

    }
}
