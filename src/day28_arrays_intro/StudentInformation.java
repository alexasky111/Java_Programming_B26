package day28_arrays_intro;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        /*
        all String types
        Array that stores mu;tiple info about students
        0 -> id
        1 -> 1st Name
        2 -> last Name
        3 -> batch Number
         */
        String[] studentOne = {"007", "James", "Bond", "7"}; // Syntax to MAKE an object of an Array (INITIALIZATION)
        System.out.println(Arrays.toString(studentOne)); //using Arrays.toStrings because I want to print the whole Array

        String[] studentTwo = new String[4]; // Syntax to MAKE an object of an Array (just an empty holder for now, no objects)
        System.out.println(Arrays.toString(studentTwo)); // --> here just to show that we have "null"
        studentTwo[0] = "010"; //assigning to the Array
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "26";
        System.out.println(Arrays.toString(studentTwo));

        String[] studentThree = new String[4]; // 4 elements but by default are null type
        Scanner input = new Scanner(System.in); // you need to create an object in order to use it that is why we have a SCANNER to put in Information
        System.out.println("Enter your id: ");
        studentThree[0] = input.nextLine(); // we are storing the ID to this position
        System.out.println("Enter your 1st name: ");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name: ");
        studentThree[2] = input.nextLine();
        System.out.println("Enter your batch num: ");
        studentThree[3] = input.nextLine();
        System.out.println(Arrays.toString(studentThree));


        //                     --->     With the Loop     <---

        String[] studentFour = new String[4]; // Size = 4
        String[] questions = {"Enter your id: ", "Enter your 1st name: ", "Enter your last name: ", "Enter your batch num: "};

        for (int i = 0; i < 4; i++) { // ALSO: i < studentFour.length (the length of the array) the loop is going up to the end of the word's length
            System.out.println(questions[i]); // reading each element of the question array
            studentFour[i] = input.nextLine(); //assigning the Scanner input into our StudentFour array
        }
        System.out.println(Arrays.toString(studentFour));


    }
}
