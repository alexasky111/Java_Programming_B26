package replits.vending_machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // DO NOT TOUCH BELOW

        Scanner input = new Scanner(System.in);
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee", 4.50, 10),
                new Drink("Iced Tea", 2.50, 5),
                new Drink("Smart Water", 4.0, 20),
                new Drink("Coke", 2.30, 13),
                new Drink("Bottle Water", 1.5, 0));

        switch (input.nextInt()) {
            case 1:
                System.out.println(vending.drinks.get(0));
                break;
            case 2:
                System.out.println(vending.drinks.get(3));
                break;
            case 3:
                vending.select(1);
                System.out.println(vending.isSelected);
                System.out.println(vending.amountLeftToPay);
                break;
            case 4:
                vending.select(4);
                System.out.println(vending.isSelected);
                System.out.println(vending.amountLeftToPay);
                break;
            case 5:
                vending.select(10);
                System.out.println(vending.isSelected);
                System.out.println(vending.amountLeftToPay);
                break;
            case 6:
                vending.select(2);
                System.out.println(vending.pay(4));
                System.out.println(vending.change);
                System.out.println(vending.current.getQuantity());
                break;
            case 7:
                vending.select(2);
                System.out.println(vending.pay(2));
                System.out.println(vending.change);
                System.out.println(vending.current.getQuantity());
                break;
            case 8:
                vending.select(2);
                System.out.println(vending.pay(5));
                System.out.println(vending.change);
                System.out.println(vending.current.getQuantity());
                break;
            case 9:
                vending.cancel();
                System.out.println(vending.current);
                System.out.println(vending.amountLeftToPay);
                System.out.println(vending.isSelected);
                break;
        }
    }
}
