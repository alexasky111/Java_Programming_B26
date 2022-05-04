package day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String firstName = "Oleksandra";
        String lastName = "Pohorielova";
        String gender = "Female";
        int age = 27;
        String companyName = "Amazon";
        boolean areTheyFullTime = true;
        String jobTitle = "SDET";
        int salary = 115000;
        int numberPTO = 25;
        boolean areTheyMarried = true;
        char suite = 'C';

        System.out.println("My name is "+firstName+" "+lastName);
        System.out.println("I am a "+gender+" of "+age+" years old");
        System.out.println("I work for a company called "+companyName+" in a "+areTheyFullTime+" "+jobTitle+" position");
        System.out.println("I make $ "+salary+" and have "+numberPTO+" pto days in a year");
        System.out.println("Married "+areTheyMarried);
        System.out.println("I live in the suite "+suite);

    }
}
