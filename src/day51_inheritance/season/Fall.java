package day51_inheritance.season;

public class Fall extends Season {
    public Fall(double highestAvTemperature, double lowestAvTemperature) {
        super("Fall", highestAvTemperature, lowestAvTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Read a Book");
    }
}
