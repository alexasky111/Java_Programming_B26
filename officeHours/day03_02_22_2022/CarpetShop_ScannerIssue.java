package day03_02_22_2022;

import java.util.Scanner;

public class CarpetShop_ScannerIssue {
    public static void main(String[] args) {
        /*
        - Ask the user which room do they need carpet? (String)
                            			List of Rooms
                            				Bedroom
                            				Kitchen

                            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 51.84 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Which room do you need carpet?");
        String typeOfRoom = input.nextLine();

        double totalCost = 0;
        boolean validType = true;
        String result = "";

        switch (typeOfRoom) {
            case "Bedroom":
                System.out.println("What are the room type dimensions?");
                double dimensions = input.nextDouble();
                totalCost = (dimensions * dimensions) * 3.14;
                break;

            case "Kitchen":
                System.out.println("What is the length of the room? ");
                double length = input.nextDouble();
                System.out.println("What is the width of the room? ");
                double width = input.nextDouble();
                totalCost = length * width;
                break;
            default:
                validType = false;
                result = "Invalid Room Type";
                System.out.println(result);

        }
        if (validType){
        System.out.println("What is your delivery address? ");
        input.nextLine();
        String address = input.nextLine();
        System.out.println("TotalCost for your carpet is $" + totalCost + " and it will be delivered to " + address + " in one week");
        }





    }


}

