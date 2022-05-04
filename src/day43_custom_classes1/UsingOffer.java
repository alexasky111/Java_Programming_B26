package day43_custom_classes1;

public class UsingOffer {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Apple", "Charlotte, NC");
        System.out.println(offer1);
        System.out.println();
        Offer offer2 = new Offer("Yum.com", "Richmound", 115_000);
        System.out.println(offer2);
        System.out.println();
        Offer offer3 = new Offer("ProInsurance", "Charlotte", 115_000, true, 20);
        System.out.println(offer3);
    }

}
