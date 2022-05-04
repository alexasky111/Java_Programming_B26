package day08_relational_operators;

public class GallonsToLiters {
    public static void main(String[] args) {
        /*
        Create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters
____________________________________________________________
         */

        int weHaveGallons = 99;
        double totalLiters = weHaveGallons*3.78541178;

        System.out.println(weHaveGallons+" gallons equal to "+totalLiters+" liters");


    }
}
