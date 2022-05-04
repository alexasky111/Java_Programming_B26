package saims_practices_for_loopsArrayMethod;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,

	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,

	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next().toLowerCase();
        System.out.println("Enter your last name: ");
        String lastName = input.next().toUpperCase();

        // id: jSmi8

        char ch = lastName.charAt(0);

        char ch1 = firstName.charAt(0); //to stop on the 1st letter

        String last = lastName.substring(1,3); // to get the rest of the letters from the last String starts from index 1 -> 'm', we need two indexes in total, in a string the last one is not included,s o we add +1 -> (1, (2+1)->3)

        String last1 = last.toLowerCase(); // to make last to lower case

        int num = firstName.length() * 2;

        String id = "" + ch1 + ch + last1 + num;

        System.out.println("id: " + id);






    }
}
