package day26_nested_loops;

public class Nested_Loops_w_break {
    public static void main(String[] args) {

        // Break Statement:
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);

            if (i == 'C') {
                break;
            }
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            if (i == 3) {
                break;
            }
        }
        System.out.println("---------------------------------------");
        // Continue Statement
        for (char i = 'A'; i <= 'E'; i++) {
            // I want to skip 'C' --> A,B,D,E
            if (i=='C') {
                continue;
            }
            System.out.println(i);

        }


    }
}
