package saims_practices_for_loopsArrayMethod;

public class NestedLoops_HW2 {
    public static void main(String[] args) {
    /*
    Print this shape:

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
     */
     char star = '*';

     for ( int i = 1; i <= 8; i++){
         for (int j = 1; j <= i; j++) {
             System.out.print(star+" ");
         }
         System.out.println();
     }











    }
}
