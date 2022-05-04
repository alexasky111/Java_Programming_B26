package day45_custom_classes;

import java.util.Arrays;

public class UsingFood {

    public static void main(String[] args) {
        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays", 2);
        System.out.println(chips);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        //To change the quantity
        apples.quantity = 10;
        //To change the price
        apples.unitPrice = 1.99;
        //Method that counts total price q*unitPrice
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        chips.unitPrice = 1.99;
        chips.calculatePrice();
        System.out.println(chips);
//
        //To create an Array
        Food[] allFood = {apples, chips, chicken, null}; //new Food[4]
        System.out.println(allFood[2]); //to print the 3rd element

        allFood[3] = new Food("Fish", 4, 3.55);// making a new Food object and adding it to an Array allFood in position in index 3

        System.out.println(Arrays.toString(allFood));

        //Calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;
        for (Food each : allFood) { //Food is a datatype of each element just like String each
            System.out.println(each);
            totalPriceAll += each.totalPrice;

        }
        System.out.println(totalPriceAll);

    }

}
