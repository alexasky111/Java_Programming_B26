package day51_inheritance.season;

public class Winter extends Season{
    public Winter(double highestAvTemperature, double lowestAvTemperature) {
        super("Winter", highestAvTemperature, lowestAvTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
