package day53_abstraction.allCars;

import day53_abstraction.allCars.Car;

public abstract class ElectricCar extends Car {
    //ElectricCar is concrete, then we make it abstract, so it is not a concrete class anymore
    //Car is abstract

    public abstract void charge();//can have an abstract m-thod because now ElectricCar is an abstract class
}
/*

    the ElectricCar class is a sub class of the Car class

    the Car class was abstract and ElectricCar is also abstract

    abstract class can have abstract methods

    so, there is no problem to inherit and we don't need to override any method in this class

 */