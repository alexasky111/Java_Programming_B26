package Interview_Questions;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please print the number: ");
        int number = input.nextInt();
//        // String message = "";
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(number);
//        }

        String result;

        result = number % 3 == 0 && number % 5 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : "invalid";
        System.out.println(result);

    }

}
