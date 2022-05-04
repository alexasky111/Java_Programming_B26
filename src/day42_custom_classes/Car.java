package day42_custom_classes;

public class Car {
    /*
    Create a class Car
create instance variables:
    model, year, color, fuel level (percent number)
create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */
    //model, year, color, fuel level (percent number)

    String model, color;
    int year;
    double fuelLevel;

    // Always toString() method to be able to print
    public String toString(){
        return "My car model is "+ model + "\nIts color is: "+color+"\nCar's year: "+year+"\nFuels level of " + model+ " is: "+fuelLevel+"%";
    }
    //    - drive(): [void]
    //        prints: driving $model
    //        subtract 5 from the fuel amount
    public void drive() {
        System.out.println("driving "+model);
        fuelLevel -=5;
    }
    //  - fillTank(): [void]
    //        prints: filling tank
    //        fuel level will be maxed at 100

    public void fillTank(){
        System.out.println("Filling tank... ");
        fuelLevel = 100;
    }

    /*
    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false
     */

    public boolean isLow(){
        if(fuelLevel < 25){
            return true;
        } else {
            return false;
        }
    }





}
