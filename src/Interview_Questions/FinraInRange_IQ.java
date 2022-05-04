package Interview_Questions;

import java.util.Scanner;

public class FinraInRange_IQ {
    public static void main(String[] args) {
        /*
        similar to fizzbuzz

        number
        % 3 --> fin
        % 5 --> ra
        both --> finra
        neither --> number
      repeated up to some number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your stopping point");
        int stop = input.nextInt();

        for (int i = 1; i < stop; i++) {
          // separate if statements because we need both of conditions to be checked
            String str = "";
            if (i % 3 == 0) {
                str += "fin";//that's when i wanted to see fin
            }

            if (i % 5 == 0) {
                str += "RA";// that's when i wanted to see RA
            }
            System.out.println(str.isEmpty() ? i : str); //it's in the loop so it'll be
        }















    }
}
