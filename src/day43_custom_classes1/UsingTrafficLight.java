package day43_custom_classes1;

public class UsingTrafficLight {

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green");
        System.out.println(light.color);

        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light2.color);

        //light2.color = "Yellow";
    }
}
