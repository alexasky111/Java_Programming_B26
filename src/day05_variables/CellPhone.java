package day05_variables;

public class CellPhone {

    //apple, iphone, black, 1000, 128, true, A

    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 10";
        String color = "black";
        int price = 1000;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';


        System.out.println("I have an "+brand+", "+model+", "+color+", "+price+", "+storage+", "+hasCamera+", "+sim);
        System.out.println("I have an "+model+" from "+brand);
        System.out.println("It came in the color "+color+" it has "+storage+" GB");
        System.out.println("For the sim type of "+sim+" with a camera "+hasCamera+" the total price was $ "+price);
        // approach 2 w/ String variable:

        String fullMessage = "\nI have an "+brand+", "+model+", "+color+", "+price+", "+storage+", "+hasCamera+", "+sim+ "\nI have an "+model+" from "+brand+"\nIt came in the color "+color+" it has "+storage+"GB\nFor the sim type of "+sim+" with a camera "+hasCamera+ " the total price was $"+price;

        System.out.println(fullMessage);
        System.out.println(fullMessage); // the point that, we can print the whole message again, very easily


    }
}
