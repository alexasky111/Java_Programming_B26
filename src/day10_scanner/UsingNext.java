package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today? ");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next(); //accepts a single word/string

        System.out.println("Enter your last name");
        String lastName = input.next(); // the issue i have nextLine() after any method will stop the program

        input.nextLine(); // this is a solution-empty line of "input.nextLine();" so "the enter" input from the line above is absorbed here

        System.out.println("What is your address");
        String address = input.nextLine();

        System.out.println("Today: "+day);
        System.out.println("First name "+firstName); // displaying my results
        System.out.println("Last name "+lastName);
        System.out.println(address);



    }



}
