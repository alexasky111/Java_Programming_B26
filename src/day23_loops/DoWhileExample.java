package day23_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        // this is a valid boolean where

        int a = 0;
        do {
            // everything btw the {} are in the loop body
            System.out.println(a);
            a++;
        } while (a <= 10);



        System.out.println("With False boolean");

        int a2 = 0;
        do {
            // everything btw the {} are in the loop body
            System.out.println(a2);
            a2++;
        } while (a2 == 10);


        System.out.println("As while loop");

        int a3 = 0;
        while(a3==10){
            System.out.println(a3);
            a3++;
            //I will never see any result
        }


    }
}
