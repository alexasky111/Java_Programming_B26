package day02_02_16_2022;

public class TimeConverter {
    public static void main(String[] args) {
        /* Create class named "TimeConverter" and make a main method

                - Write a Java program to convert time from second to hours/min/day format
                - Input Seconds : 3695


        Expected Output:
        inputSeconds is 3695
        1 hours 1 minutes 35 seconds

        60 sec = 1 min
        60 min = 1 hours
        60*60 = 3600 in hours

        */
        int inputSeconds = 9000;
        int hours, minutes, seconds, day;

        hours = inputSeconds/3600;
        minutes = inputSeconds % 3600/60;
        seconds = inputSeconds % 60;
        day = (inputSeconds/3600)*24;


        System.out.println(day+" days,"+hours+" hours, "+seconds+" seconds.");
    }
}
