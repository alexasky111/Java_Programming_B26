package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {

        CydeoStudent emre = new CydeoStudent("Emre", 5);
        System.out.println(emre);
        //access from Class or an obj
        CydeoStudent.printInfo();
        emre.printInfo();
        System.out.println();
        //access to the String [] 1st element
        System.out.println(CydeoStudent.instructors[0]);

        System.out.println();
        //to print elements of the array in Static m-thod
        for (String each:CydeoStudent.instructors){
            System.out.println(each);
        }

    }
}
