package interview_tasks.from_generalpdf;

import java.util.ArrayList;

public class Task44 {
    /*
    //44  COMBINE
int[] a = {1,2};
        int[] b ={3,4};
        output
     [1, 2, 3, 4]
=========================================================================
  ---WHAT IS OUTPUT----
 String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="Nisum";
        System.out.println((S1.equals(S2))); -> true
        System.out.println(S1==S2); -> false
        System.out.println((S3==S1)); -> true
     */
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b ={3,4};
        System.out.println(combineArrays(a, b));

        String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="";
        String S4 ="Nisum";
        // == checks the address
        System.out.println(S3+S4 == S1);
        System.out.println((S1.equals(S2))); //-> true
        System.out.println(S1==S2); //-> false
        System.out.println((S3==S1));// -> true
    }

    public static ArrayList<Integer> combineArrays(int[] a, int[] b){

        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            output.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            output.add(b[i]);
        }

        return output;
    }

}
