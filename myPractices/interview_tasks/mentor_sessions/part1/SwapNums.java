package interview_tasks.mentor_sessions.part1;

public class SwapNums {
    public static void main(String[] args) {
        swapNumbers(20, 0);
    }

    public static void swapNumbers(int a, int b) {
        //40, 20
        a = a+b;//60
        b = a-b;//60-20
        a = a-b;//60-40
        System.out.println("a = "+a+"\nb = "+b);
    }

    /*
    4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
     */

}
