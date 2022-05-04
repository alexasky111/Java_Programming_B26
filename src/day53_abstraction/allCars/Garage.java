package day53_abstraction.allCars;

public class Garage {
    public static void main(String[] args) {
        //running class
//        Car obj1 = new Car(); -> Car is abstract we cannot make an obj of this class
        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println();
        Honda obj3 = new Honda();
        obj3.start();
        //both Toyota and Honda were concrete classes, bc they were not abstract, so we had to implement the start method

//        ElectricCar obj4 = new ElectricCar(); -> ElectricCar is abstract, we cannot make an obj of this class
        Tesla obj5 = new Tesla();
        obj5.start(); //defined in the Car Class
        obj5.charge(); //defined in the ElectricCar class

        //Tesla was a non-abstract class, so it was concrete, which mean it had to all override the abstract methods from the super class

    }
}
