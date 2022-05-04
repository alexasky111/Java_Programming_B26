package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class Create_Id {
    /*
    Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstNAme = input.next().toLowerCase().trim();
        System.out.println("Enter last name: ");
        String lastName = input.next().toLowerCase().trim();

        //id: jSmi8

        // to get the 1st letter of the 1st name -> charAt or substring
        String id = firstNAme.substring(0, 1);

        // get the 1st letter from the last name in the upper case + lastName(the rest of the characters ->)
        id += lastName.substring(0,1).toUpperCase() + lastName.substring(1,3); // -> this is the last name
        id += firstNAme.length() * 2;
        System.out.println(id);
        // Q How to make a character with chatAt method lowercase ("" + charAt).toLowerCase -> extra step, but can use the substring












    }
}
