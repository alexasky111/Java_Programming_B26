package interview_tasks.mentor_sessions.part4;

import java.util.function.Predicate;

public class Task022 {
    public static void main(String[] args) {

        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
22) Numbers - Prime Number
Write a method that can check if a number is prime or not
     */


}
