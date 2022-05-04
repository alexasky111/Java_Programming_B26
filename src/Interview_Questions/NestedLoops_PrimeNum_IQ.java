package Interview_Questions;

public class NestedLoops_PrimeNum_IQ {
    public static void main(String[] args) {
        /*
        [IQ] Prime in range
Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */
        int num = 50;

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + ", ");
            }

        }














    }
}






