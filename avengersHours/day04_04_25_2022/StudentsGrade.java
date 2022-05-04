package day04_04_25_2022;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalQuestions;
        int missed;
        System.out.println("How many questions in the exam: ");
        totalQuestions = input.nextInt();
        System.out.println("How many questions is missed: ");
        missed = input.nextInt();

        FinalExam obj1 = new FinalExam(totalQuestions, missed);

        System.out.println(obj1.getScore());
        System.out.println(obj1.getGrade());


    }
    /*
    - Create StudentsGrade runner class
                      -ask user how many question in the exam (Scanner)
                      -ask user how many question is missed (Scanner)
                      -give user the final grade

     */
}
