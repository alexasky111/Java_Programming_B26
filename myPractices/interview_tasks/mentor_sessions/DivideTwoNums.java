package interview_tasks.mentor_sessions;

public class DivideTwoNums {
    public static void main(String[] args) {
        System.out.println(divideWithoutDivisionOperator(25, 5));

    }

    public static int divideWithoutDivisionOperator(int num1, int num2){
        int count = 0;
        if (num1>num2 && num2!=0){
            while (num1>=num2){
                num1 = num1 - num2;
                count++;
            }
            return count;
        }
        return -1;
    }
    /*
    2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
     */



}
