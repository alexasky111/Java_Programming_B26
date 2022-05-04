package day48_encapsulation;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large", 3);
        System.out.println(pizza1);
        pizza1.setNumOfToppings(2);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("", -2);
        //second.numberOfToppings = -2;
        System.out.println(pizza2);

        pizza2.setSize("small");
        pizza2.setNumOfToppings(-3);
        System.out.println(pizza2);
    }
}
