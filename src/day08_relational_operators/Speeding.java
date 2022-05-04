package day08_relational_operators;

public class Speeding {
    public static void main(String[] args) {
        /*
        create a class called Speeding, and write a program to determine if the car is speeding

        declare 3 variables:
        current speed, speed limit, speeding boolean

        print
        "Are you speeding? " true/false
         */
    int currentSpeed, speedLimit;
    boolean isSpeeding;
    currentSpeed = 75;
    speedLimit = 55;
    isSpeeding = currentSpeed>speedLimit;

        System.out.println("Are you speeding? "+isSpeeding);
    }
}
