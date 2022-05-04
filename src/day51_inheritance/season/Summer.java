package day51_inheritance.season;

public class Summer extends Season{

    public Summer(double highestAvTemperature, double lowestAvTemperature ){
        super("Summer", highestAvTemperature, lowestAvTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
