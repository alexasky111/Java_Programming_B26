package day14_nested_if_statements;

import java.util.Scanner;

public class NestedIfHW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean citizenship = false;
        boolean resident = false;
        int age = 34;
        boolean hasHighSchoolDiploma = true;
        String message = "";

        if ((citizenship || resident) && hasHighSchoolDiploma && (age >= 18 && age<=35)) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!citizenship && !resident) {
                message = "You must be a citizen or a resident";
            }
            if (!hasHighSchoolDiploma) {
                message = "You must have a high school diploma";
            }
            if (age < 18 || age>35) {
                message = "Your age must be between 18 to 35 years old";
            }
            System.out.println(message);
        }


    }


}

