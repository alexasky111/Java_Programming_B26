package interview_tasks.from_generalpdf;

public class Task20_21_22 {
    /*
    Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is
 divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
  a concatenation of the respective words Codility, Test and Coders in this
   given order. For example, numbers divisible by both 2 and 3 should be
    replacée by CodilityTest and numbers divisible by all three numbers: 2,3
     and 5, should be replaced by CodilityTestCoders.
 1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
     */
    public static void main(String[] args) {
//        codilityTest(30);
//        System.out.println(factorial(3));
        System.out.println(convertToStr(-1234556));
    }

    public static void codilityTest(int number) {

        for (int num = 1; num <= number; num++) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if ((num % 2 == 0 && num % 3 == 0) || (num % 5 == 0 && num % 3 == 0) || (num % 2 == 0 && num % 5 == 0)) {
                System.out.println("CodilityTest");
            } else if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) {
                System.out.println("Codility");
            } else {
                System.out.println(num);
            }
        }
    }

    public static int factorial(int num) {
        int n = 1;
        for (int j = 1; j < num; j++) {
            n *= (j + 1);
        }
        return n;
    }

    /*
    //22
Numbers -- Prime Number. Prime num is a number that divided by itself and 1
Write a method that can check if a number is prime or not
     */
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return (count == 2);
    }

    /*
    //23
int num=-1234556;
-6554321
     */
    public static String convertToStr(int num) {

        String str = String.valueOf(num);
        String res = "";

        if (str.charAt(0) == '-') {
            res += str.charAt(0);
            for (int i = str.length() - 1; i >= 1; i--) {
                res += str.charAt(i);
            }
        } else {
            res = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}