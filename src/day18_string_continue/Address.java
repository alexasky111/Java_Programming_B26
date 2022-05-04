package day18_string_continue;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address: ");
        String address = input.nextLine().trim().toUpperCase();
        String result = "";

        if (address.startsWith("500")) {
            result += "\nhouse on the right side";
        } else if (address.startsWith("600")) {
            result += "\nhouse on the left side";
        } else {
            result += "\nInvalid address";
        }

        if (address.toLowerCase().contains("dr")) {
            result += "\nhouse on drive";
        } else if (address.toLowerCase().contains("lane")) {
            result += "\nhouse on lane";
        } else if (address.toLowerCase().contains("ave")) {
            result += "\nhouse on avenue";
        } else {
            result += "\nInvalid address";
        }

        System.out.println(address+result);









    }
}
