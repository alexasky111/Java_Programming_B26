package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the grade? ");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it? ");
        int attempt = input.nextInt();
        boolean validAttempts = attempt < 4 && attempt > 0; // true

        if (attempt==1) {
            grade -= grade * 0.1;

        } else if(attempt==2){
            grade = grade-(int)(grade * 0.2);

        } else if(attempt==3){

            grade *=0.65;
        } else {
            validAttempts = false;
            System.out.println("Not a valid attempt number");
            // if you do it by assigning true by default you'd use validAttempts=false
        }
        if (validAttempts) {

            System.out.println(grade);
        }


    }
}
