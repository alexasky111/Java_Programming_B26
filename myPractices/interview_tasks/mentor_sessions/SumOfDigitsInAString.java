package interview_tasks.mentor_sessions;

public class SumOfDigitsInAString {
    public static void main(String[] args) {
        String str = "-111";
        System.out.println(sumOfDigits(str));


    }
    /*
    8) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str) {

        int sum = 0;
        int number = Integer.parseInt(str); //to use a Wrapper class m-thod to convert String to int
        number = Math.abs(number); //to make a positive number

        while (number > 0) {
            sum += number % 10; //gives the last number
            number /= 10; //removes the last number
        }

        return sum;
    }
}
