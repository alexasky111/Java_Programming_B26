package day05_variables;

import java.sql.SQLOutput;

public class EmployeeInfor1 {
    public static void main(String[] args) {

        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numberOfPTO;
        double salary;
        boolean isFullTime, isMarried;

        firstName = "James";
        lastName = "Bond";
        companyName = "MI6";
        jobTitle = "Special Agent";
        gender = 'M';
        suite = 'D';
        age = 40;
        numberOfPTO = 15;
        salary = 1_000_000;  //1,000,000 - normally how we would do it, but I can only put - 1_000_000
        isFullTime = true;
        isMarried = false;


        String fullDetails = "Employment information for "+firstName+" "+lastName+"."+gender+"\n"+jobTitle+" at "+companyName+" currently "+age+" years old. \n"+companyName+" is located in suite "+suite+". This year's salary comes to $ "+salary+".\nOther details: PTO: "+numberOfPTO+", full time? "+isFullTime+", married? "+isMarried;

        System.out.println(fullDetails);




    }
}
