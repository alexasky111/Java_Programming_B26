package day15_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please push the floor number: \n\tfloor 1 --> Lobby, StarBucks, Amazon Pick Up\n\tfloor 2 --> NASA, Cydeo, Discover\n\tfloor 3 --> Uber, Lyft, Chase\n\tfloor 4 --> Rooftop, Lounge");

        int floorNumber = input.nextInt();
        String message = "";
        switch (floorNumber) {
            case 1:
                message = "You are on the 1st floor!";
                break;
            case 2:
                message = "You are on the 2nd floor!";
                break;
            case 3:
                message = "You are on the 3rd floor!";
                break;
            case 4:
                message = "You are on the 4th floor!";
                break;
            default: message = "Invalid Floor Selected. Please try again";
        }
        System.out.println(message);


    }


}
