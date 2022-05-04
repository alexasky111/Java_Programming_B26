package day42_custom_classes;

public class Item {
    String name;
    double price;
    //we don't make main method in a blueprint, what info an object will have, how an object will behave


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price: " + price +
                '}';
    }
}
