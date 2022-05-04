package day18_string_continue;

import java.util.Scanner;

public class UserAndPas {
    /*
   ask the user to enter a username and password. Check if they are valid
based on the following requirements:
- The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters"  -
If it is more than or equal to 5 print: "Valid password"   +
- Also, the password should not contain the username
If the password has the username in it print: "Invalid password,   -
username should not be in it" and in that case change the password to have
the value: "password"
Print the information in the end
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.next();
        username = username.toLowerCase();

        System.out.println("Please enter your password: ");
        String password = input.next();

        if (password.length() < 5 || password.contains(username)) {
            if (password.length() < 5) {
                System.out.println("Password cannot be less than 5 characters");
            }
            if (password.contains(username)) {
                password = "password";
                System.out.println("Invalid password, username should not be in \"password\"") ;
            }
        } else {

            System.out.println("Valid password\nYour username is " + username + "\nYour password is " + password);

        }


    }
}
