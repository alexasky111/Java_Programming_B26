package day54_abstraction.homework;

public final class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void viewCart() {
        System.out.println("viewing cart in Ebay");
    }

    @Override
    public void uploadProduct() {
        System.out.println("uploading a product in Ebay");
    }

    public void buyItem() {
        System.out.println("buying an item on Ebay");
    }

    public void returnItem() {
        System.out.println("returning an item on Ebay");
    }

    public void payForShipping(boolean b1){
        System.out.println("Paying for shipping "+ b1);
    }
}
