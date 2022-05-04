package day07_unary_operators.day12_multi_if_statements;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        /*create a class Retake

declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you grade after initial submission: ");
        double grade = input.nextDouble();
        System.out.println("Please enter your attempt after initial submission: ");
        int attempt = input.nextInt();

        if (attempt == 0) {
            System.out.println("Your initial grade is: " + grade);
        } else if (attempt == 1) {
            grade *= 0.9;
            System.out.println("Your grade now is: " + grade);

        } else if (attempt == 2) {
            grade *= 0.8;
            System.out.println("Your grade now is: " + grade);
        } else if (attempt == 3) {
            grade *= 0.65;
            System.out.println("Your grade is: " + grade);
        }
        System.out.println("----------------Final grade for your assignment------------------");
        System.out.println(grade + " %");

    }
}


