package day32_multidimentional_arrays;

import java.util.Arrays;

public class CopyOf_Method {
    public static void main(String[] args) {
        int [] a = {1,2,3};

        // 1. b is a new reference but the array is the same as  the one 'a' reference is pointing to, so there is only one array made
        int [] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // 2. if what we talked is true than both results is 100 in the 1st position
        a[0] = 100;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();
        // 3. new array(object) with copied values; take values I had and make new object of it
        int [] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z));

        // 4. changes the 1st element of my Z Array
        z[0] = 500;
        System.out.println("a: "+ Arrays.toString(a)); //not changing the 1st element to 500-->still 100
        System.out.println("z: "+ Arrays.toString(z));
    }
}
