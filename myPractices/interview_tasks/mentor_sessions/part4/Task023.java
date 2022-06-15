package interview_tasks.mentor_sessions.part4;

public class Task023 {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrongDynamic(1634));

    }

    public static boolean isArmstrongDynamic(int num){
        //for all nums
        String [] arr = String.valueOf(num).split("");
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int multiply = 1;
            for(int j = 0; j < arr.length; j++){
                multiply *= Integer.parseInt(arr[i]);
            }
            sum += multiply;
        }

        return num == sum;
    }


    public static boolean isArmstrong(int num) {
    //for 3 digits
        int sumOfCubes = 0;
        int remainder = 0;
        int temp = num;


        while (num > 0) {
            remainder = num % 10; //finds the last digit
            sumOfCubes += (remainder * remainder * remainder);
            num /= 10;  //removes the last digit, since we already added it to the sum
        }

        return sumOfCubes == temp;


    }
    /*
    23) Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number
     */
}
