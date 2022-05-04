package day04_variables;

public class Fruits {

    public static void main(String[] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("\tThis is how many apples we have: "+apples);
        System.out.println("Grapes: "+grapes);
        System.out.println("Bananas: "+bananas);

        System.out.println("\nsold some apples");
        apples = 66; //reassigning apples to have value of 25
        System.out.println("\tApples after selling: "+ apples);

        int price = 15;

        System.out.println("The price of my "+ apples+ " apples is $" + price);



    }
}
