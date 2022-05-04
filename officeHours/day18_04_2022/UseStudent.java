package day18_04_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class UseStudent {
    public static void main(String[] args) {

        Student student = new Student("sasha");
        System.out.println(student);
        Student student1 = new Student("vika",30);
        System.out.println(student1);
        Student student2 = new Student("ganjina",25,26);
        System.out.println(student2);

        Student student3 = new Student("karina",25,26);
        Student student4 = new Student("mike",25,26);
        Student student5 = new Student("dombe");
        Student student6 = new Student("michael");

        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(student,student1,student2,student3,student4,student5,student6));
        //or make an array and put them all in

        //to access an object in the array list
        allStudents.get(0); //sasha

        ArrayList<Student> b26Students = new ArrayList<>();

        for (Student each : allStudents) {
            if(each.batchNumber ==26){
                System.out.println(each.batchNumber);
                b26Students.add(each);//a container for student
            }

        }
        System.out.println(b26Students);

        System.out.println();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        allStudents.removeIf(each -> each.batchNumber !=26);
        System.out.println(allStudents);

    }
}
