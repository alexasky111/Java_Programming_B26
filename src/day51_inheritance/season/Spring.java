package day51_inheritance.season;

public class Spring extends Season {
    public Spring(double highestAvTemperature, double lowestAvTemperature) {
        super("Spring", highestAvTemperature, lowestAvTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }
}
