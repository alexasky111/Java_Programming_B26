package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = input.next().toUpperCase();
        System.out.println("Please enter your last name: ");
        String lastName = input.next().toUpperCase();
        System.out.println("Your initials are " + firstName.charAt(0)+lastName.charAt(0));

// firstName = firstName.toUpperCase();
// char firstLetter = firstName.toUpperCase().charAt(0);



    }
}
