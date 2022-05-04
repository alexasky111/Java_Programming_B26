package day06_arithmetic__operators;

public class House {
    /*Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park nearby, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
*/

    public static void main(String[] args) {
        String houseType = "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasAPool = true;
        boolean isOnSale = false;
        double costOfHouse = 1_000_000.99;  // you could use 4.5 and concatenate the String
        String address = "1234 Central Park";
        int zipcode = 21998;
        boolean hasPark = true;
        double schoolRating = 4.6;

        /* Approach II
        String houseType = "Penthouse", address = "1234 Central Park";
        int numberOfBedrooms = 4, numberOfBathrooms = 3, numberOfKitchens = 2, zipcode = 21998;
        boolean hasBasement = false, hasAttic = false, hasAPool = true, isOnSale = false, hasPark = true;

        double costOfHouse = 1_000_000.99, schoolRating = 4.6;  // you could use 4.5 and
        */



        String houseInfo = "The "+houseType+" on "+address+", "+zipcode+" costs $"+costOfHouse+"\nThe "+houseType+" has "+numberOfBedrooms+" bedrooms, "+numberOfBathrooms+" bathrooms, "+numberOfKitchens+" kitchens\nIt also includes a basement: "+hasBasement+", has an attic: "+hasAttic+"\nAlso has a pool: "+hasAPool+", and is on sale: "+isOnSale+", and has a park: "+hasPark+".\nThe schools in the area has a rating of "+schoolRating;

        System.out.println(houseInfo);






    }
}
