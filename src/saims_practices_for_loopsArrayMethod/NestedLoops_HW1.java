package saims_practices_for_loopsArrayMethod;

public class NestedLoops_HW1 {
    public static void main(String[] args) {
      /*
Print this shape:

         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
       */


        String star1 = "* ";

        for ( int i = 0; i < 8; i++){

            for (int j = 1; j <= 9; j++ ) {

                System.out.print(star1);
            }
            System.out.println();


        }







    }

}
