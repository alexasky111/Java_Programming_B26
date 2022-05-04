package day18_string_continue;

import java.util.Scanner;

public class MyLogIn {
    public static void main(String[] args) {
         /* Ask the user to enter the username make sure the username is in lowercase

         Ask the user to enter a password check if the password is more than 8 characters long

         valid system password: "jamesbond"

         -> if the entered password is matches the system password
            logged in

            otherwise print:
            invalid password
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a user name: ");
        String userName = input.next();

        userName = userName.toLowerCase(); // STRING IS IMMUTABLE YOU HAVE TO REASSIGN

        System.out.println("Please enter the password: ");
        String password = input.next();
        if (password.length() >=8 && password.equals("jamesbond")) { // the password will not check second part if the 1st is not true
            System.out.println("Logged in with " + userName);
        } else {
            System.out.println("Invalid password");
        }

        }



}


