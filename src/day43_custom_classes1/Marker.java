package day43_custom_classes1;

public class Marker {

    String type;
    String brand;
    String color;

    //To make a Constructor(we have an issue about the same name of instance variable and a parameter local variable)
    public Marker(String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
