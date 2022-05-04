package day32_multidimentional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        // 1. 1st[] --> the size of the 2D Array-Whole array
        String [][] cydeo = new String[4][];
        //String [][] cydeo = new String[4][3];
        //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]] - 4 inner arrays with 3 positions inside of each
        System.out.println(Arrays.deepToString(cydeo));

        // 2. 1st element in 2D Array is groupdOne; To store 1st element into the 2D Array
        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding group two");

        // 3. 2nd element in 2D Array is groupTwo
        String [] groupTwo = {"Basri", "Olga"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding group 3");

        // 4. New Way to assign the array in the 2D Array; Tried to assign it in the same time instead of using a separate variable
        cydeo[2] = new String[]{"Mustafa", "Zima", "Alex"};
        System.out.println(Arrays.deepToString(cydeo));

        // 5. We took Array's values in the position 3 and assigned in the position 4
        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[2]; // or Arrays.copyOf(cydeo[2], cydeo.length);
        System.out.println(Arrays.deepToString(cydeo));

        // 6. To Loop the 2D Array; The type for 2 dimensional is 1 dimensional
        for (String[] innerArray : cydeo) { //To go through the elements of 2D Array-"cydeo" that are String Arrays

            for (String eachWord : innerArray) { //To go through the element of each 1D Array, elements are String
                System.out.println(eachWord); //To get the 1st letter of words --> eachWord.charAt[0]
            }

        }
    }
}
