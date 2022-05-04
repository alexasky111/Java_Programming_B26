package day47_encapsulation.traffic;

public class TrafficLight {
    //1st make an instance var private
    private String color;

    public TrafficLight(String color) {
        setColor(color);
    }

    //2nd create Getter & Setter

    public String getColor() {
        return color;
    } //--> for reading the private data

    public void setColor(String color) { //--> for writing(modifying) the private data
        switch (color.toLowerCase()) {
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }//--> to set the color
    }
}
