package day55_polymorphism.shopping;

public interface Shipping {
    String country = "US"; //this is a static variable
    void payForShipping(boolean b);
}
