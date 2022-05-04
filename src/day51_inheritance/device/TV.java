package day51_inheritance.device;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    @Override
    public void useDevice(){
        System.out.println("Using TV");
    }



    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
