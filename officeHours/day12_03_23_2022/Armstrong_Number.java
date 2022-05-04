package day12_03_23_2022;

public class Armstrong_Number {
    /*
    Task 4 :   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.


                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153
     */

    public static void main(String[] args) {

        isArmstrong(153);
    }


    public static void isArmstrong(int number) {

        int lastDigit = 0;
        int totalDigits = 0;
        int originalNumber = number;

        while (number > 0) {

            lastDigit = number % 10;    // to find last digit

            System.out.println("lastDigit " + lastDigit);

            number /= 10;
            //number=number/10;

            totalDigits += lastDigit * lastDigit * lastDigit;

        }

        if (totalDigits == originalNumber) {

            System.out.println(originalNumber);

        }

    }
}
