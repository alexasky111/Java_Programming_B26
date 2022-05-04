package day51_inheritance.device;

public class Phone extends Device{

  public Phone(String brand, String model, double price, boolean isWireless) {
     super(brand, model, price, isWireless);

////        super.brand = brand;
////        super.model = model;
////        super.price=price;
////        super.isWireless = isWireless;

    }


    @Override
    public void useDevice(){
        System.out.println("Using Phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
