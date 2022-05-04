package day02_02_16_2022;

public class GallonsToLitter {
    public static void main(String[] args) {
        /*
        1.Create a class called GalonsToLiters, and write a program that can convert the gallons tto litters
                           Ex:
                              gallon = 10;
                              output:
                                    10 gallons equal to 37.8541 liters

                           Hint: 1 gallon = 3.78541 liters
         */

        int gallon = 10;
        double liters = gallon*3.78541;

        System.out.println(gallon+" gallons equal to "+liters+" liters");
    }
}
