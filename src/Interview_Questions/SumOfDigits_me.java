package Interview_Questions;

import java.util.Scanner;

public class SumOfDigits_me {
    public static void main(String[] args) {
        /*
                Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
   */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = input.nextLine();
        int sum = 0;


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(each >='0' && each <= '9') {
                sum += each-48 ;
            }

        }

        System.out.println("The sum of numbers is: "+sum);










    }
}
