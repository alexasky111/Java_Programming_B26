package day43_custom_classes1;

public class UsingCar1 {

    public static void main(String[] args) {
        //To create an object
        Car1 car1 = new Car1();
        System.out.println(car1);
        car1.model = "Chiron";
        car1.color = "Black";
        car1.year = 2022;
        car1.fuelLevel = 80;

        System.out.println(car1);
        System.out.println(car1);
        System.out.println();

        car1.drive();
        car1.drive();
        System.out.println(car1.fuelLevel);

        car1.fillTank();
        System.out.println(car1.fuelLevel);
    }


}
