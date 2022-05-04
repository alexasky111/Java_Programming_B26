package saims_practices_for_loopsArrayMethod;

public class Array_T02 {
    public static void main(String[] args) {
        /*
        Average Number from Array
Given an int array calculate the average number
-> Make it flexible, so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */
        int[] numbers = {1, 2, 3};
        int averageNum = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            sum += numbers[i];
         averageNum = sum / numbers.length;
        }
        System.out.println("\nThe average number is "+averageNum);


    }
}
