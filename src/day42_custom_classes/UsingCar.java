package day42_custom_classes;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.color = "red";
        car1.year = 2017;
        car1.fuelLevel = 50;
        car1.drive();
        car1.fillTank();
        car1.isLow();

        System.out.println(car1);
        System.out.println();
        car1.drive();
        car1.drive();
        car1.drive();

        System.out.println(car1.isLow() ? "Your fuels is low"+car1.fuelLevel : "Your fuel is ok");

    }


}
