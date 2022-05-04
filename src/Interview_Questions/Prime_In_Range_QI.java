package Interview_Questions;

public class Prime_In_Range_QI {
    public static void main(String[] args) {
        int range = 500;

        for (int i = 2; i <= range; i++) { //the purpose is to check all the num from 2 to the value the range variable

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) { //
                // prime 5? 2-5

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + ", ");
            }
        }


/*
                i = 5
                j = 2; j < 5; j++
                    i % j
                    5 % 2
                    5 % 3
                    5 % 4
                    =====

                i = 6
                j = 2; j < 6; j++
                    i % j
                    6 % 2 --> count++;
                    6 % 3 --> count++;
                    6 % 4
                    6 % 5

                 */


    }
}
