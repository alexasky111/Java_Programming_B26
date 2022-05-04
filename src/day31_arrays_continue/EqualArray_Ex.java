package day31_arrays_continue;

import java.util.Arrays;

public class EqualArray_Ex {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = a;

        // Compares the memory location of the objects, not the actual objects --> FALSE
        System.out.println( a == b);

        // Compares the values of the Arrays --> TRUE
        System.out.println(Arrays.equals(a,b));

        // Compares the a array w/ the c array, they are both reference to the same array object
        System.out.println(a==c);


        //just assigning the Array method to a variable --> it's okay
        boolean same = Arrays.equals(a,b);

        // The order of the elements does matter, for equals() --> must be exact
        int [] d = {3,2,1};
        System.out.println(Arrays.equals(a,d));
    }
}
