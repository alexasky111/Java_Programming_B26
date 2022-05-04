package day03_02_22_2022;

public class P02_CodilityTest {
    /*
     Write a function:
				    		 that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

				    			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
     */
    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if (number % 2 == 0) {
            result += "Codility";
        }

        if (number % 3 == 0) {
            result += "Test";
        }

        if (number % 5 == 0) ;
        {
            result += "Coders";
        }

        System.out.println("result = " + result);

        // w/ multi branches is MUCH LONGER!
//
//        if (number % 2 == 0) {
//            result = "Codility";
//        } else if (number % 3 == 0) {
//            result = "Test";
//        } else if (number%5==0) {
//            result = "Coders";
//        }else if (number%2==0 && number%3==0)
//        {
//            result= "CodilityCoders";
//        } else if (number%3==0 && number%5==0){
//            result = "TestCoders";
//        } else if (number%2==0 && number%3==0 && number%5==0) {
//            result = "CodilityTestCoders";
//        }
//        System.out.println(result);

    }
}
