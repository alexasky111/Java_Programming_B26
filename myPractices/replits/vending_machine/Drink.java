package replits.vending_machine;

import day42_custom_classes.Coffee;

public class Drink {
    private String name;
    private double cost;
    private int quantity;

    public Drink(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    /**
     *
     * @return String in this format:
     *Drink{name='Iced Coffee', cost=4.5, quantity=10}
     */

    @Override
    public String toString() {

        return "Drink{name= '"+getName()+"', cost="+getCost()+", quantity="+getQuantity()+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
