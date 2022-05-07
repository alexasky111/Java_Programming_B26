package day55_polymorphism.shopping;

public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart(){
        System.out.println("Viewing cart");
    }

    @Override
    public void payForShipping(boolean b){
        System.out.println(b?"Paying for shipping": "Free shipping");
    }
    @Override
    public void buyItem(){
        System.out.println("Buying item from Amazon");
    }
    @Override
    public void returnItem(){
        System.out.println("Returning to amazon");
    }
}
