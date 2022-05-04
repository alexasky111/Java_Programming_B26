package repractice_tasks;

public class Armstrong {
    /*
Task 4 :   Write a method that can check if a number is Armstrong number

            Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.


            print all the armstrong numbers with three digit
            Armstrong numbers are     === 153 370 371 407 === for 3 digits

             153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                         1       125      27  == 153
 */
    public static void main(String[] args) {
//        System.out.println(isArmstrongNum(153));
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrongNum(int number) {

        //To convert int to a str
        String numStr = String.valueOf(number);

        int res = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int temp = 1;
            for (int j = 0; j < numStr.length(); j++) {

                //To convert str to int
                temp *= Integer.parseInt(numStr.charAt(i) + "");
            }
            //To store all multiplied nums in res and check if res = int number
            res += temp;
        }
        return res == number;
    }

    public static boolean isArmstrong(int number) {

        int temp = 1;
        int sum = 0;
        int res = number;

        String numStr = String.valueOf(number);

        while (number>0) {
            temp = number % 10; //to make the last number
            number = number / 10;
            int temp1 = 1;

            for (int i = 0; i < numStr.length(); i++) {

                temp1 *= temp;
            }
            sum += temp1;
        }
        return sum == res;
    }


}
