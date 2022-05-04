package day14_nested_if_statements;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your year: ");
        //        int year = 2022;
        int year = input.nextInt();
        String message;

        if (year >= 1346 && year <= 1353) { // We Use "&&" because it is some kind of range, and we need to put it in the condition!
            message = "The Black Death";
        } else if (year >= 1665 && year <= 1666) {
            message = "Black Plague of London";
        } else if (year >= 1770 && year <= 1772) {
            message = "Russian plague";
        } else if (year == 1889 || year == 1890) {
            message = "Flu pandemic";
        } else if (year == 1916) {
            message = "American polio epidemic";
        } else if (year >= 1918 && year <= 1920) {
            message = "Spanish Flu";
        } else if (year == 2009 || year == 2010) {
            message = "H1N1";
        } else if (year >= 2014 && year <= 2016) {
            message = "West African Ebola";
        } else if (year == 2020 || year == 2021) {
            message = "Covid19";
        } else {
            message = "No Pandemic";
        }
        // In a normal situation it is not mandatory in terms of syntax to use at the ned of multibranch "else", but in this case I've assigned a String variable and there is a chance of never use value of "message" in case all of them are FALSE.

        System.out.println(message);
    }
}
