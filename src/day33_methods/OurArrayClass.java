package day33_methods;

public class OurArrayClass {
    // "nums" is the parameter
    public static void firstElement(int[] nums) {
        System.out.println("First element " + nums[0]);
    }

    public static void lastElement(int[] nums) {
        System.out.println("Last element " + nums[nums.length - 1]);
    }

    public static void middleElements(int[] nums) {

        // Must check if the array equal or odd
        if (nums.length % 2 == 0) {

        // To get the 1st middle num in equal Array, to get the 2nd middle num in equal Array
            System.out.println("First middle element " +nums[nums.length/2-1]);
            System.out.println("Second middle element " +nums[nums.length/2]);
        } else {
            System.out.println("Middle: "+ nums[nums.length/2]);
        }
    }
    public static void printArray(int [] nums){
        String result = "START | ";
        for (int num : nums) {
            result +=num+"~";
        }
        result += " | END";
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] numbers = {13, 25, 35, 44, 53, 62};
        int[] numbers2 = {13, 25, 35, 44, 53, 62, 100};

        firstElement(numbers);
        lastElement(numbers);
        middleElements(numbers);
        printArray(numbers);

        // It is a new int Array(different syntax to declare an Array) and we give values right away without references
        printArray(new int [] {40,20,30});

    }
}
