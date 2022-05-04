package day05_variables;

public class House {
    /*Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3 */
    public static void main(String[] args) {


        String houseType, address;
        byte numberOfBedrooms, numberOfKitchen;
        int costOfTheHouse, zipcode;
        double numberOfBathrooms;
        boolean isThereABasement, isThereAnAttic, isThereAPool, isTheHouseForSale, isParkNearBy;
        char questionMark, ratingOfSurroundingSchoolDistricts;

        //QuestionTOSaim: Do we need to assign variables in order of declaration???


        houseType = "Private House";
        address = "219 Gunas Dr";
        numberOfBedrooms = 4;
        numberOfKitchen = 1;
        costOfTheHouse = 450_000;
        zipcode = 27948;
        numberOfBathrooms = 3.5;
        isThereABasement = false;
        isThereAnAttic = true;
        isThereAPool = false;
        isTheHouseForSale = false;
        isParkNearBy = true;
        questionMark = '?';
        ratingOfSurroundingSchoolDistricts = '5';

        System.out.println("We recently built a house w/ the following details:\nThe address of the house: " + address + "\nThe zipcode of the house: " + zipcode + "\nThe type of the house: " + houseType + "\nThe number of bedrooms: " + numberOfBedrooms + "\nThe number of bathrooms: " + numberOfBathrooms + "\nThe number of kitchens: " + numberOfKitchen + "\nHas a basement" + questionMark + " " + isThereABasement + "\nHas an attic: " + isThereAnAttic + "\nHas a pool: " + isThereAPool + "\nHas a park nearby: " + isParkNearBy + "\nThe rating of surrounding school districts: " + ratingOfSurroundingSchoolDistricts + "\nThe total cost of the house: $" + costOfTheHouse + "\nThe house is currently for sale" + questionMark + " " + isTheHouseForSale);

    }
}
