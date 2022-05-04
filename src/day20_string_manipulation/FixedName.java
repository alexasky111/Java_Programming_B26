package day20_string_manipulation;

import java.util.Scanner;

public class FixedName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first name");
        String firstName = in.next(); //    jaMMEs
        System.out.println("Enter your last name");
        String lastName = in.next(); //

        firstName = firstName.trim().toLowerCase(); //james
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase(); // I get -> J
        // difference btw charAt() -> is the data type! it'll also give you a character, but we want a string to chain toUpperCase() -> to have the 1st letter Upper Case

        fixedFirst += firstName.substring(1); // James


        String fixedLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirst + " "+ fixedLast);





    }
}
