package day28_arrays_intro;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {100, 120, -80, 90, 250, -10};

        int max = nums[0]; // I'm using just the first number as a default
        int min = nums[0];

        for (int i = 0; i < nums.length ; i++) { // it's taking one element at a time in my array

            int number = nums[i]; // --> number of every number for reusability

            if (number > max){ // if (nums[i] > max)

                max = number; // max = nums[i]
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println("Max: "+max+ "\nMin: "+min);









    }
}
