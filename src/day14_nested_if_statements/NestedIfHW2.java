package day14_nested_if_statements;

import java.util.Scanner;

public class NestedIfHW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much time of the game is left: ");
        int minutes = input.nextInt();
        String message = "";
        if (minutes > 0 && minutes < 90) {
            System.out.println("Lets see whats happening in the game");
            if (minutes >= 75 && minutes <= 90) {
                message = "just getting started";
            } else if (minutes >= 60 && minutes <= 74) {
                message = "players are doing their best";
            } else if (minutes >= 30 && minutes <= 59) {
                message = "middle of the game is going great";
            } else if (minutes>0 && minutes<=29){
                message = "the end of the same is approaching";
            }
            System.out.println(message);
        } else {
            message = "Not Valid";
            if (minutes < 0) {
                message = "minutes cannot be a negative number";
            } else if (minutes > 90) {
                message = "games cannot be longer than 90 minutes";
            }
            System.out.println(message);
        }


    }
}
