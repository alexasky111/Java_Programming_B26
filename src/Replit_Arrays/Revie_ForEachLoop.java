package Replit_Arrays;

public class Revie_ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {30, 12,155, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); //allows to print every element->traditional
        }

        for (int element : nums) {
            System.out.println(element); // the same as nums[i]
        }

        String [] classes = {"java", "soft skills", "sellenium"};
        //traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
        // each LOOP --> when only reading
        for (String element : classes) { //element will be every element from the beg to the end of the Array
            System.out.println(element);
        }
        double [] prices = {78.0,99.0,65.8};
        for (double each:prices) {
            System.out.println("$"+each); //every single element of Array=prices one iteration at a time

        }











    }
}
