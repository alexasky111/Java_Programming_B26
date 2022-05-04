package saims_practices_for_loopsArrayMethod;

public class Methods_Tasks {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public static void oddNumbers() {

        // 1. To print odd numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void evenNumbers() {

        // 2. To print even numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    create a method that will accept an age and determine if the person is
eligible to vote. Person must be 18 years or older to vote
______________________________________________________________________
create a method that will accept a number. Find and print if it is a
positive number, negative number, or zero
     */
    // 3. Method to determine the Age
    public static void eligibleAge(int age) {
        if (age >= 18) {
            System.out.println("" + age + " - Congrats! You are eligible to vote");
        } else {
            System.err.println("You must me 18 to be eligible to vote");
        }
        System.out.println();
    }

    // 4. Method to determine the number's type
    public static void numberType(int num) {
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("positive number");
        } else {
            System.err.println("negative number");
        }
        System.out.println();
    }

    /* Create a method that will that accepts three numbers. Check if the three
    numbers equal to 180.
    If they are equal to 180 print: "This is a triangle"
    If they are equal to 360 print: "This is a circle"
       */
    // 4. Method to determine the figure's shape based on numbers
    public static void triangleOrCircle(int num1, int num2, int num3) {
        if (num1 + num2 + num3 == 180) {
            System.out.println("This is a triangle");
        } else if (num1 + num2 + num3 == 360) {
            System.out.println("This is a circle");
        } else {
            System.err.println("Invalid numbers");
        }
        System.out.println();
    }

    /*
    create a method that accepts a String and print each character of the
String on a seperate line
______________________________________________________________________
create a method that will that will accept a String and find if it is
Palindrome or not
______________________________________________________________________
Create a method that accept an int array. Take the sum of all the numbers
and print the result
     */
    // 5. Method that accepts a String
    public static void printStr(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + "");

        }
    }

    // 6. Checks if it is a Palindrome
    public static void palindrome(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(name.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }

    // 7. Sum of all the numbers in the Array
    public static void sumOfNums(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("The sum of all the numbers in the Array is " + sum);
        System.out.println();
    }

    /*
    Create a method that accepts an int array and a number. Check if the array
contains that number or not
Ex:
input: ( {1, 2, 3, 4}, 4 ) -> true
input: ( {1, 2, 3, 4}, 7 ) -> false
______________________________________________________________________
     */

    // 8. To check if an Array contains an int number
    public static void numInArr(int[] arr, int num) {
        String allNums = "";
        for (int i = 0; i < arr.length; i++) {
            allNums += arr[i];
        }
        System.out.println(allNums.contains("" + num) ? "true" : "false");
    }


    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
        eligibleAge(17);
        numberType(-100);
        triangleOrCircle(90, 30, 60);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your 3 numbers: ");
//        triangleOrCircle(input.nextInt(), input.nextInt(), input.nextInt());

        printStr("Alex");

//        Scanner in = new Scanner (System.in);
//        System.out.println("Enter your name");
//        printStr(in.nextLine());
        palindrome("library");
        int[] nums = {12, 13, 14};
        sumOfNums(nums);

        int[] elements = {1, 2, 3, 4};
        numInArr(elements, 1);
    }
}
