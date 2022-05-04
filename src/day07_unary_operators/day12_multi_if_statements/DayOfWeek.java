package day07_unary_operators.day12_multi_if_statements;

public class DayOfWeek {
    public static void main(String[] args) {

        int day = 6;

        boolean monday = day == 1;
        boolean tuesday = day == 2;
        boolean wednesday = day == 3;
        boolean thursday = day == 4;
        boolean friday = day == 5;
        boolean saturday = day == 6;
        boolean sunday = day == 7; // You could do them without booleans --> right away in the code !

        if (monday) {
            System.out.println("Monday");
        } else if (tuesday) {
            System.out.println("Tuesday");
        } else if (wednesday) {
            System.out.println("Wednesday");
        } else if (thursday) {
            System.out.println("Thursday");
        } else if (friday) {
            System.out.println("Friday");
        } else if (saturday) {
            System.out.println("Saturday");
        } else if (saturday) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day of the week");
        }


    }
}
