package interview_tasks.mentor_sessions.part4;

public class Task023 {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));

    }

    public static boolean isArmstrong(int num) {

        int sumOfCubes = 0;
        int remainder = 0;
        int temp = num;

        while (num > 0) {
            remainder = num % 10; //finds the last digit
            sumOfCubes += (remainder * remainder * remainder);
            num /= 10;  //removes the last digit, since we already added it to the sum
        }

        return sumOfCubes == temp;


    }
    /*
    23) Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number
     */
}
