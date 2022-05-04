package day25_recap;

import java.util.Scanner;

public class Prime_Number {
    /*
    [IQ] Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11

	Output:
		prime
Ex:
	Input:
		10

	Output:
		not prime
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        boolean isPrime = num >= 2; // to check the positive numbers

        // this loop is checking if our num is evenly divisible by value from 2 to the NUMBER I PUT IN SCANNER
        for (int i = 2; i < num; i++) {// because all numbers will be divisible by 1

            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }

        if(isPrime){
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }



        /*
            n % 2
            n % 3
            n % 4
            ...
            n % less than number
            11
            11 % 2
            11 % 3
            11 % 4
            11 % 5
            ..
            11 % 10
            10
            10 % 2 --> change the boolean to false
         */






    }
}
