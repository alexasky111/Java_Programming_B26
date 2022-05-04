package day46_static;

import com.sun.security.jgss.GSSUtil;

import java.util.Objects;

public class UseBestBuy {
    public static void main(String[] args) {
        //Because they are static I can access them, I don't need to make a new Object
        System.out.println(BestBuy.headquaters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComp);

        //To make an object --> members(variables) means all the parts
        BestBuy store1 = new BestBuy("Oak Drive"); //accessing the instance variable
        System.out.println(store1.location); //accesing the variable
        System.out.println(store1.numberOfComp);

        store1.numberOfComp--;
        System.out.println(BestBuy.numberOfComp);

        BestBuy store2 = new BestBuy("Main St");
        System.out.println(store2.location);

        store2.numberOfComp -=5;
        System.out.println(store1.numberOfComp);
        System.out.println(BestBuy.numberOfComp);
        store2.location = "Fairfax";
        System.out.println(store1.location);
        System.out.println(store2.location);


        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComp);
        store1.reStock();
        System.out.println(BestBuy.numberOfComp);

        //BestBuy.openStore()
        store1.openStore();
        store2.openStore();


    }
}
