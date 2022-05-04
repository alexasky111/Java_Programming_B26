package day04_variables;

public class School {

    public static void main(String[] args) {

        int number = 11;
        int number1 = 22;
        int number2 = 33;
        int number3 = 44;
        int number4 = 55;

        int totalNumberOfStudents = number+number1+number2+number3+number4;

        System.out.println("There are "+number+" students in grade 1");
        System.out.println("There are "+number1+" students in grade 2");
        System.out.println("There are "+number2+" students in grade 3");
        System.out.println("There are "+number3+" students in grade 4");
        System.out.println("There are "+number4+" students in grade 5");

        System.out.println("Total number of students in my school is "+totalNumberOfStudents);

        double days = 100.5;
        double average = 99.9;
        double gpa = 3.5;

        double sumOfDouble1 = days+average+gpa;

        System.out.println("Number of days in a year - "+days);
        System.out.println("Number of snow days in a year - "+average);
        System.out.println("The average gpa in school is "+gpa);
        System.out.println("The sum of the rest of the numbers is "+sumOfDouble1);




    }
}
