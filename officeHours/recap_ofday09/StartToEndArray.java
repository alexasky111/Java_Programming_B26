package recap_ofday09;

import java.util.Arrays;

public class StartToEndArray {
    /*
    Task 01 : Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]
     */
    public static void main(String[] args) {
        int start = 11;
        int end = 18;
        int length = end - start;
        int[] newArray = new int[length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = start++;
        }
        System.out.println(Arrays.toString(newArray));

        // increase the same Array by 1
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] + 1; //OR newArray[i] +=1;
        }
        System.out.println(Arrays.toString(newArray));

        // FOR EACH LOOP --> Read only Loop
        for (int each : newArray) {
            each += 1;
        }
        System.out.println(Arrays.toString(newArray));

//        int each = 0;
//        for (int i = 0; i < newArray.length; i++) {
//            each=newArray[i];
//            each+=1;
//        }
//        System.out.println(Arrays.toString(newArray));


    }
}


