package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {
        Target target = new Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
        target.returnItem();
        target.returnItem();
//        target.payForShipping(true); Target class doesn't implement the Shipping interface
        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
    }

}
