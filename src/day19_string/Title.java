package day19_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name including titles");

        String name = input.nextLine().toLowerCase(); // Just to handle all to be lower case, but have to exclude lowercase mr and mister
        String result = "";

        if (name.startsWith("mr") || name.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam"))
        {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        }















    }
}
