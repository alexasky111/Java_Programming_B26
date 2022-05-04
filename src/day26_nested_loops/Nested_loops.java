package day26_nested_loops;

public class Nested_loops {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe\n");
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");
        System.out.println("-----------------------------------------------------");


        // outer loop - the loop that's running inner loop repeatedly
        for (int j = 0; j < 3; ) { //int j = 1; j <= 3; --> both give
            // 3 executions/iterations

        // inner loop
            for(int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe\n");
        }





    }
}
