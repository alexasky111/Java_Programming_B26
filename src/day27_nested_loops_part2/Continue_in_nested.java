package day27_nested_loops_part2;

public class Continue_in_nested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if(i == 1 || i == 2) {
                continue;
            }
            System.out.println("i" + i);
        }

            for (int j = 0; j < 3; j++) {
////                if (j == 1) { the iteration 1 will be skipped in the inner loop
////                    continue;
//                }
                System.out.println("\tj" + j);

            }
        }




    }

