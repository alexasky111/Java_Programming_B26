package day54_abstraction.homework;

public class UsingShopping {
    public static void main(String[] args) {

        Ebay obj1 = new Ebay();
        obj1.buyItem();
        obj1.returnItem();
        obj1.uploadProduct();
        obj1.payForShipping(true);
        obj1.viewCart();

        Amazon obj2 = new Amazon();
        obj2.buyItem();
        obj2.returnItem();
        obj2.payForShipping(false);
        obj2.viewCart();

        Target obj3 = new Target();
        obj3.buyItem();
        obj3.returnItem();
    }
}
