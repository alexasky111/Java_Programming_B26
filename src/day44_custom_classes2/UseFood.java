package day44_custom_classes2;

import java.sql.Array;

public class UseFood {

    public static void main(String[] args) {
        Food food1 = new Food("apple");
        System.out.println(food1);
        Food food2 = new Food("banana", 3);
        System.out.println(food2);
        Food food3 = new Food("kiwi", 5, 1.99, 0);
        System.out.println(food3);
        System.out.println();

        //create an array of food objects
        Food foodObjects [] = new Food[3];

        //create & initialize actual food objects using constructor
        foodObjects[0] = new Food("apple", 4, 5.99,0);
        foodObjects[1] = new Food("apricot", 3,11,0);
        foodObjects[2] = new Food("kiwi", 5, 1.99, 0);

        //display the product object data
        System.out.println(foodObjects[0]);
        System.out.println(foodObjects[1]);
        System.out.println(foodObjects[2]);

        for (int i = 0; i < foodObjects.length; i++) {
            if(foodObjects[i].name.startsWith("a")){
                System.out.println(foodObjects[i].name);
            }
        }

        //find foodObjects w/ tot price >20, print
        for (int i = 0; i < foodObjects.length; i++) {
            if(foodObjects[i].totalPrice > 20){
                System.out.println(foodObjects[i].name +" "+ foodObjects[i].totalPrice);
            }
        }

    }


}
