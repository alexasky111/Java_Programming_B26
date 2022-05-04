package day47_encapsulation.pizza;

public class UsePizza {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 3);

        pizza1.setNumberOfToppings(2);
        pizza1.setSize("large");
        pizza1.calculatePrice();
        System.out.println(pizza1);

        pizza1.setSize("x-large");
        pizza1.calculatePrice();
        System.out.println(pizza1);
    }
}
