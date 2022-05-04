package day09_scanner;

public class Discount {

/*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */
    public static void main(String[] args) {

        boolean isItTheWeekend = true;
        boolean areYouTeacher = false;
        boolean areYouPoliceOfficer = true;
        boolean areFirefighter = false;

        boolean doYouGetDiscount = isItTheWeekend &&
                (areYouTeacher || areYouPoliceOfficer || areFirefighter); // if no parentheses will go left to right and won't apply what we are trying to check is a teacher OR a police officer OR firefighter

        System.out.println(doYouGetDiscount);

        System.out.println();
    }
}
