package day35_return_method;

public class ContainArray {
    /*
    Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static boolean contains (int [] nums, int element) {
        // To loop through Array to see if the num is there, if each=element in the Array return true
        for (int each : nums) {
            if(each==element){
                return true;
            }
        }
        // By default my Array doesn't contain the element
        return false;
    }
}


