package day53_abstraction.allCars;

import day53_abstraction.allCars.Car;

public class Toyota extends Car {

    //when overriding it is losing the abstract
    @Override
    public void start(){
        System.out.println("Insert Key");
        System.out.println("Turn the key");
    }
}
