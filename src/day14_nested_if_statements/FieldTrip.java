package day14_nested_if_statements;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("***Please enter your grade!***");
        int grade = input.nextInt();
        // You'll never be wrong to give a default value -> you'll always avoid Java Initialization error!
        String location = "", teacher = "";
        int numberOfGroups = 0;


        if (grade >= 1 && grade <=6) {
            System.out.println("Data based on grade: ");

            if (grade == 1) {
                // WE MADE A VALID RANGE FOR GRADE
                grade = 1;
                location = "Apple Orchard";
                numberOfGroups = 3;
                teacher = "Ms Smith";
            } else if (grade == 2) {
                grade = 2;
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr Lee";
            } else if (grade == 3) {
                grade = 3;
                location = "Aquarium";
                numberOfGroups = 7;
                teacher = "Ms Wilson";
            } else if (grade == 4) {
                grade = 4;
                location = "Movie Theatre";
                numberOfGroups = 2;
                teacher = "Ms Reyes";
            } else if (grade == 5) {
                grade = 5;
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms Lela";
            } else if (grade == 6) {
                grade = 6;
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr Wyatt";
            } // just 'else' would be okay, bc I have a pre-condition!

            System.out.println("Grade: "+grade);
            System.out.println("Location: "+location);
            System.out.println("number of groups: "+numberOfGroups);
            System.out.println("Teacher: "+teacher);

        } else {
            // You couldv'e just print "Grade must be between 1-6" without nested
            System.out.println("Invalid grade.");
            if (grade < 1) {
                System.out.println("Grade must be between 1-6");
            } else if (grade > 6) {
                System.out.println("Grade must be between 1-6");
            }
        }


    }
}
