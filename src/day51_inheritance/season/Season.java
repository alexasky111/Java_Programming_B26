package day51_inheritance.season;

public class Season {
    String name;
    double highestAvTemperature;
    double lowestAvTemperature;

    public Season(String name, double highestAvTemperature, double lowestAvTemperature) {
        this.name = name;
        this.highestAvTemperature = highestAvTemperature;
        this.lowestAvTemperature = lowestAvTemperature;
    }

    public void activity(){
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAvTemperature=" + highestAvTemperature +
                ", lowestAvTemperature=" + lowestAvTemperature +
                '}';
    }
}
