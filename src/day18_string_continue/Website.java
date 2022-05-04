package day18_string_continue;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the website url: ");
        String website = input.next();
        website = website.toLowerCase();

        boolean validStart = website.startsWith("www");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (validStart && validEnd) {
            System.out.println(website + " is a valid website"); // Nested when you need one condition to be true to use the second condition!
        } else {

            if (!validStart) {
                System.out.println("url needs to start with www.");
            }
            if (!validEnd) {
                System.out.println("url needs to end with .com, .edu, .net, or .gov");
            }

        }
    }


}

