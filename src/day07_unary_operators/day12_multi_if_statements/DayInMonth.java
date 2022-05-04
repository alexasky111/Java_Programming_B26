package day07_unary_operators.day12_multi_if_statements;

import java.time.Month;

public class DayInMonth {
/*
    create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
    use the month number input to determine how many days are in that month.
    use the following data to help you determine the number of days in each month:

    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

    ex:
            12
            31 days
    ex:
            9
            30 days */
public static void main(String[] args) {

    // 3 single "iF" statements | In situation where 3 single statements all will run without stop after "true"
    int month = 11;

    boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    boolean has30Days = month == 4 ||  month == 6 || month == 9 || month == 11;
    boolean has28Days = month == 2;

    if(has31Days) {
        System.out.println("31 days");
    }

    if(has30Days) {
        System.out.println("30 days");
    }

    if(has28Days) {
        System.out.println("28 days");
    }
    // --------------------------------------------------------------------------------------------------------------

    // Multi "iF" statements | multi line goes one at a time from top to the bottom until it is "true"

    if(has31Days){
        System.out.println("31 days");
    } else if (has30Days) {
        System.out.println("30 days");
    } else if (has28Days) {
        System.out.println("28 days");
    }
    else {
        System.out.println("Invalid number for month");
    }

    String result;
    result = has31Days ? "31 days" : has30Days ? "30 days" : has28Days ? "28 days": "Invalid number for month";

}

}
