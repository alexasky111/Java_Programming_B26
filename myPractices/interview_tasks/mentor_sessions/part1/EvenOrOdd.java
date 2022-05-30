package interview_tasks.mentor_sessions.part1;

public class EvenOrOdd {
    public static void main(String[] args) {
        identifyEvenOrOdd(-1);
    }
    public static void identifyEvenOrOdd(int num) {
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("Even");
            } else if (num % 2 == 1) {
                System.out.println("Odd");
            }
        }else{
            System.out.println("Number can't be less than 0");
        }
    }
    /*
    1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */


}