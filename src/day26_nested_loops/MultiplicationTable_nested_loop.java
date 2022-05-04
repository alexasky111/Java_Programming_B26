package day26_nested_loops;

public class MultiplicationTable_nested_loop {
    public static void main(String[] args) {
        /*
        print the multiplication by the numbers from 1 10 we will see for all num 1-10
         */
        for (int num = 1; num <= 10; num++) {
            System.out.println("Number: " + num);

            for (int multi = 1; multi <= 15; multi++) {
                int total = num * multi;
                System.out.print(num + "*" + multi + "=" + total + " | ");

            }// end of inner loop
            System.out.println(); // to break the lines

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println("...");
//        }


        } //end of outer loop


    }//end of main method
}//end of the class





