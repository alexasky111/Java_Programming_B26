package interview_tasks.from_generalpdf;

public class Task26 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(371));
    }
    /*
    //26
Write a method that can check if a number is Armstrong  number

Armstrong number is a number that is equal to the sum of cubes of its digits.
 For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
 understand why 153 is an Armstrong number. Let's try to understand why 371 is an
  Armstrong number.
     */

    public static boolean isArmstrongNum(int number) {

        String str = number + "";
        char[] arr = str.toCharArray();
        int sumOfCubes = 0;


        for (int i = 0; i < arr.length; i++) {
            int multiply = 1;
            for (int j = 0; j < arr.length; j++) {
                multiply *= Integer.parseInt(arr[i]+"");
            }
            sumOfCubes+=multiply;

        }
        return (number==sumOfCubes);
    }
}
