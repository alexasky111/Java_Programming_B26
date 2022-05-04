package day51_inheritance.device;

public class Device {
    String brand, model;
    double price;
    boolean isWireless;

    public void useDevice(){
        System.out.println("Using Device");
    }


    public Device(String brand, String model, double price, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
