package day54_abstraction.homework;

public final class Amazon extends OnlineShopping {
    //Concrete Class
    @Override
    public void viewCart() {
        System.out.println("view cart");
    }

    @Override
    public void buyItem() {
        System.out.println("buy an item");
    }

    @Override
    public void returnItem() {
        System.out.println("returning item");
    }

    @Override
    public void payForShipping(boolean b1) {
        System.out.println("paying for shipping");
    }
}
