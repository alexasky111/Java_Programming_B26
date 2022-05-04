package day33_methods;

import java.util.Scanner;

public class Greeting {
    // 1. name - local variable(just like you made a variable in a method)
    public static void hello(String name){ // "name" is a parameter for the method
        System.out.println("hello "+ name+" , how are you");
    }

    public static void main(String[] args) {

    // 2. define the parameter and print the statement from the method above
        hello("James");
        hello("Jamie");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name");

    // 3. "name" is just a local variable for Scanner to get the name from the Scanner
        String name = input.nextLine();
        hello(name); //hello(nextLine())


    }
}
