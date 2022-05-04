package day01_02_15_2022;

import org.w3c.dom.ls.LSOutput;

public class P02_PersonInfo {
    public static void main(String[] args) {

        /*
         Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

                      Create class named "PersonInfo" and make a main method

                            Create variables and give value related to you:

                                - String name
                                - byte age
                                - char gender
                                - boolean student
                                - short number of siblings
                                - long favorite number
                                - int number of seasons in your area
                                - double birth date: (month.day)
                                - int year
                                - String full birthday date with year
                                - String favorite quote
                                - Print the person information with using concat/escape characters

         */

        String name = "Alex";
        byte age = 27;
        char gender = 'F';
        boolean student = true;
        short numberOfSiblings = 3;
        long favoriteNumber = 1111111111;
        double birthDate = 06.30;
        int year = 1994;
        String fullBirthdayDate = birthDate+"0"+"."+year;
        String favoriteQuote = "I can and I will";

        System.out.println(fullBirthdayDate);

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("favoriteNumber = " + favoriteNumber);
        System.out.println("============Escape Seq===============");

        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender);

        // DRY Principle --> Don't Repeat Yourself
        // Keep It Simple


    }






        }
