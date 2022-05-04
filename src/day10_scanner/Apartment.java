package day10_scanner;

import java.util.Scanner;

public class Apartment {
    /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

         */

//By declaring first the variables - you can avoid inputting "input.nextLine();" after each Scanner type that is not input.nextLine();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is the address: ");
        String address = input.nextLine();

        System.out.println("This is the name of owner: ");
        String nameOfOwner = input.nextLine();

        System.out.println("This is number of units: ");
        int numberOfUnits = input.nextInt();

        System.out.println("The average size of each unit is: ");
        double unitSize = input.nextDouble();

        System.out.println("The monthly rent amount is: ");
        double rentAmount = input.nextDouble();

        System.out.println("Number of washers and driers: ");
        int washerDryer = input.nextInt();

        System.out.println("Allows pets or not: true/false -  "); // In the console you have to enter T or F !!!
        boolean arePetsAllowed = input.nextBoolean();

        System.out.println("Has a pool: true/false -  ");
        boolean hasAPool = input.nextBoolean();

        System.out.println("Length of lease: ");
        int lengthOfLease = input.nextInt();

        System.out.println("Total residents in the building: ");
        int numberOfResidents = input.nextInt();

        input.nextLine();

        System.out.println("The phone number of owner: ");
        String ownerCell = input.nextLine();

        System.out.println("Is it near the gas station: true/false -  ");
        boolean isNearGasStation = input.nextBoolean();

        System.out.println("The number of floors is : ");
        int numberOfFloors = input.nextInt();

        System.out.println("Has a basement: true/false - ");
        boolean hasBasement = input.nextBoolean();

        System.out.println("Has available units for rent: true/false - ");
        boolean hasAvUnits = input.nextBoolean();

        System.out.println("Has air conditioning: true/false - ");
        boolean hasAirCond = input.nextBoolean();

        System.out.println("The Number of parking spaces: ");
        int parkingSpace = input.nextInt();

        System.out.println("Has a wheelchair: true/false - ");
        boolean hasWheelChair = input.nextBoolean();

        System.out.println("The number of review stars");
        int rating = input.nextInt();


          /*  - monthly rent after 3 years (discount 10% off original rent)
                    - monthly rent after 6 years (discount 20% off original rent)
                    - Average number of residents per unit (total residents / number of units)
                    - Average number of parking spots per unit ( parking spots / units)
                    - Average number of units per floor ( units / number of floors)

           */
        double monthlyRentAfter3Years = rentAmount - (rentAmount * 0.10); // OR rentAmount * 0.9
        double monthlyRentAfter6Years = rentAmount - (rentAmount * 0.20);
        int averageNumberOfResidentsPerUnit = numberOfResidents/numberOfUnits;
        int averageNumberOfParkingSpots = parkingSpace/numberOfUnits;
        int averageNumberOfUnitsPerFloor = numberOfUnits/numberOfFloors;



















          }
}
