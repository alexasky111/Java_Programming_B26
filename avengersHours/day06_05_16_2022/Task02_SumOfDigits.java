package day06_05_16_2022;

public class Task02_SumOfDigits {
    /*
    Write a program that can return the sum of digits of an integer. Do not use any string manipulations.

               Ex;
               Input: 123
               Output: 6
   */
    public static void main(String[] args) {
        int number = 12345; //15

        System.out.println(number % 10); //always gives us the last digit
        System.out.println(number / 10); //basically removes the last digit since we are using integer
        System.out.println(1 / 10); //if smaller int is divided by a bigger int it always gives 0
        System.out.println(sumOfDigits(number));

    }
    public static int sumOfDigits(int number){
        int sum = 0;
        number = Math.abs(number); //makes the num positive, gets the absolute value
        while(number>0){
            sum += number%10; //add the last digit
            number = number/10; //removes the last digit, since we already added it to the sum
        }
        return sum;
    }
}
