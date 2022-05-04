package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0d;

        System.out.println("We pick up 1 water");
        System.out.println("How many items in the cart? "+ ++numberOfItems);
        //Preincrement, so the number of items increases right away than it is printed.

        price = price + 2.5; // take the price value, which is 0, and add 2.5, and then reassign to the price variable.

        System.out.println("we pick up 2 eggs");
        System.out.println("How many items in the cart? "+ ++numberOfItems);
        System.out.println("How many items in the cart? "+ ++numberOfItems);

        System.out.println(numberOfItems++); // Postincrement first read the value than it updates!!! and increments for the next value



    }
}
