package day43_custom_classes1;

import java.util.ArrayList;

public class OfferClass {
    public static void main(String[] args) {
          /*
    Make a class for Offer objects (from class)

    try to create 7 objects of Offer class and store them into an ArrayList of Offer
       maintain the list to keep the offers from your local area
    maintain the list to keep only full time offers
     */

        Offer offer1 = new Offer("Apple", "North Carolina", 110_000, true, 20);
        Offer offer2 = new Offer("Apple", "North Carolina", 110_000, false, 20);
        Offer offer3 = new Offer("Apple", "North Carolina", 110_000, true, 20);
        Offer offer4 = new Offer("Apple", "South Carolina", 110_000, true, 20);
        Offer offer5 = new Offer("Apple", "Virginia", 110_000, false, 20);
        Offer offer6 = new Offer("Apple", "Virginia", 110_000, false, 20);
        Offer offer7 = new Offer("Apple", "North Carolina", 110_000, true, 20);

        //To create an array list
        ArrayList<Offer> list = new ArrayList<Offer>();
        list.add(offer1);
        list.add(offer2);
        list.add(offer3);
        list.add(offer4);
        list.add(offer5);
        list.add(offer6);
        list.add(offer7);

        //To print only North Carolina offers
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).location == "North Carolina") {
                list.remove(list.get(i).location);
                System.out.println(list.get(i).company + " " + list.get(i).location);
            }
        }
        System.out.println();

        //To print only full time offers
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isFullTime) {
                System.out.println(list.get(i).company + " " + list.get(i).location);
            }
        }
    }
}
