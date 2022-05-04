package day47_encapsulation.computer;

import day47_encapsulation.computer.Computer;

public class UsingComputer {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //1st use could be Computer.hasBattery, Computer.hasMemory
        //1st Hello World, then class is used-->so static will run, then constructor message
        //even when i'm not using static info, it'll run whenever class is loaded/used
        //Using the Class for the 1st time
        Computer computer1 = new Computer("HP", 500, "silver");

        //OR using the class also
        System.out.println(Computer.hasScreen);
//        System.out.println(computer1);

//        System.out.println(Computer.brand); --> invalid because to access the instance variable you must use an object not a Class
        System.out.println(computer1.brand); //Correct way of calling the instance var
        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);
        System.out.println(computer1.hasMemory); // -->You can access from the obj a static var, but generally it is accessed from the Class, but in general you want to access static members by class name

    }
}
