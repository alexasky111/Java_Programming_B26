package day27_nested_loops_part2;

public class Break_in_nested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i" + i); // statement printed 5 times bc if was after the sout statement
            if (i == 3) {
                break;
            } // when the above break statements is run we stop the outer loop, which means both will no longer run. We get 3 full iterations of the outer loop, including the inner loop running start to finish then when i is equal to 3 the outer loop will stop

            for (int j = 0; j < 2; j++) {
                System.out.println("j" + j);
//            break; if the break is here, the outer loop will iterate fully, but the inner loop will execute the 1st iteration and then the break runs, which stops the inner loop. Code resumes after the outer loop iterations finish
            }
            System.out.println();
//            break; stops the outer loop --> (only 1st iteration will run) --> the inner loop doesn't run anymore
        }
    }
}
