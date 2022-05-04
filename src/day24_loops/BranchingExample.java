package day24_loops;

public class BranchingExample {
    public static void main(String[] args) {
// branching is the break/continue statements

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if(i == 5) {
                break; // stops the loop, stops the loop when you choose
            }
            }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if(i == 5) { //skips number '5' that's all
                continue; //skips the rest of that current iteration
            }
            System.out.print(i + " ");

            }
        System.out.println();
        for(int i = 1; i<=100; i++){
            if(i%2==1) {// if my num is odd then continue
            continue;
            }
            System.out.println(i+ " ");
        }
        }
    }

