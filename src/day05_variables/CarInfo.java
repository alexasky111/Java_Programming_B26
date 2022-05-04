package day05_variables;

public class CarInfo {

    public static void main(String[] args) {
        String carModel, driverName;
        int licenceNumber;
        double speed;
        boolean isAutomatic;
        char licenceClass;

        carModel = "Toyota CHR";
        driverName = "Oleksandra Pohorielova";
        licenceNumber = 777777;
        speed = 90.5;
        isAutomatic = true;
        licenceClass = 'B';

        System.out.println(driverName+" was spotted at last night's event in a new "+carModel+" w/ a unique\nlicence number "+licenceNumber+".\n"+driverName+" seems to have "+licenceClass+" licence class. Her Toyota CHR is "+isAutomatic+" automatic w/\nspeed of "+speed+"mph.");
    }
}
