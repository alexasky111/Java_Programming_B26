package day08_relational_operators;

public class GiftCard {

    /* Declare and assign a gift card w/ 200
     buy 2 items. buy 1 for x price and subtract from your gift card. buy item 2 for x price again and sub from a gift card again
     print the remain bal
     */

    public static void main(String[] args) {

        double giftCard = 200;

        System.out.println("Buy item 1 for 100$");
        giftCard -=100.50; // giftcard = giftcard - 100;
        System.out.println("Buy one more item for 40$");
        giftCard -=40.50;

        System.out.println("Your gift card balance now is "+giftCard);


    }

}
