package Interview_Questions;

public class InterviewQ_PrimeNumber {
    public static void main(String[] args) {

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

      for (int i = 6; i < 50; i++) {

          if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) { // no 3, 5 bc it is already dividable

              System.out.println("" + i + " not prime");

          } else {
              System.out.println("" + i + " is prime");
          }

          }

      }





    }

