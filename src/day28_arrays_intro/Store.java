package day28_arrays_intro;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = {"shoes", "jacket", "gloves", "airpods", "IPad"};
        // Do we have jackets in stock?

        boolean hasJackets = false; //I'm assuming I don't have jackets

//Can also do w/ a count++ by checking approach, and then if count > 0 --> You found it one time
        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("jacket")) { // if my ALL items || ONE element at a time
                hasJackets = true;
                break; // as soon as I found "jacket" I broke out of my loop
            }

        }

        System.out.println(hasJackets? "Jackets in stock" : "Jackets out of stock"); //ternary

        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket"));

        /*
        if(hasJacket){
        System.out.println("Jackets in stock")
        } else {
        System.out.println("Jackets out of stock")
        }
         */

    }
}
