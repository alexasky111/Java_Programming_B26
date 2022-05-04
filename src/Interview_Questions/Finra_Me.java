package Interview_Questions;

import java.util.Scanner;

public class Finra_Me {
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
        System.out.println("Enter your stop point");
        int stop = input.nextInt();

        for (int i = 1; i < stop; i++) {
            String str = "";

            if(i % 3 == 0){
                str += "fin";
            }
            if(i % 5 == 0) {
                str += "RA";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                str += "FINRA";
            }
            System.out.println(str.isEmpty() ? i : str);

        }














    }
}
