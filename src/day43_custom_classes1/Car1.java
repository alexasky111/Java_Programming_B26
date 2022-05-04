package day43_custom_classes1;

public class Car1 {
    String model;
    int year;
    String color;
    int fuelLevel;

    public void drive(){
        System.out.println("Driving "+model);
        fuelLevel -=5;
    }

    public void fillTank(){
        System.out.println("Filling the tank");
        fuelLevel =100;
    }

    public boolean isLow(){
        return fuelLevel<25;
        //if it's less true, if more false
        //you can use an if statement, but you don't need it
    }

    public String toString(){
        return "Model: "+model+"\nYear: "+year+"\nColor: "+color+"\nFuel level: "+fuelLevel+"\n"+((isLow()) ? "Tank is low" : "Keep on driving");
        //To use ternary to use a dynamic message
    }

}
