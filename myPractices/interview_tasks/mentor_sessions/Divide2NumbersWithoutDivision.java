package interview_tasks.mentor_sessions;

public class Divide2NumbersWithoutDivision {
    public static void main(String[] args) {
        System.out.println(divideTwoNums(0,0));
    }

    public static int divideTwoNums(int a, int b) {
        int count = 0;

        if (b != 0) {
            while (a >= b) {
                a = a - b;
                count++;
            }
            return count;
        }

    return -1;
    }

    /*
    Write a method that can divide two numbers without using division operator
     */
}
