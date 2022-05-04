package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Google", "Texas", 200_000,true,15);
//        System.out.println(first);

        //To create an array list
        ArrayList<Offer> allOffers = new ArrayList<>();
        //To add in the 1st position of the ArrayList in the position of 0 ==>first
        allOffers.add(first);
        //To create a 2nd object without a reference to it
        //To access this object allOffers[1]
        allOffers.add(new Offer("Amazon", "New York", 180_000,true, 15));

        //To create an array Offer of objects; Just initializing my Array
        Offer [] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false,20),
                new Offer("Facebook", "Florida",120_000,true, 10)
        }; //I made 3 objects in my Array named moreOffers

        //To add all the elements at the same time using Arrays.asList(arr)
        allOffers.addAll(Arrays.asList(moreOffers));

        //To print 5 elements in the ArrayList allOffers
//        System.out.println(allOffers);
        System.out.println(allOffers.size());

        //To add 2 more elements to the ArrayList allOffers
        allOffers.addAll(Arrays.asList(new Offer("Discord","Chicago", 150_000, false,13),
                new Offer("Netflix", "Canada", 170_000,true,12)
        ));

        System.out.println();

        System.out.println(allOffers);
        //To create ArrayList to filter the Offers
        ArrayList<Offer> salaries = new ArrayList<>(allOffers);

        salaries.removeIf(each->each.salary <170_000);
        System.out.println("Salaries above $170,000");
        System.out.println(salaries);

        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each-> each.isFullTime == false);

        System.out.println("Only full time offers");
        System.out.println(fullTime);
    }
}
