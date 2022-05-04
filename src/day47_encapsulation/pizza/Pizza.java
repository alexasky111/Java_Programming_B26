package day47_encapsulation.pizza;

public class Pizza {

    //To create private instance var
    private String size;
    private int numberOfToppings;

    static {
        System.out.println("Static Block is Running");
    }

     //To create a Constructor
    public Pizza(String size, int numberOfToppings) {

        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    //To create a getter
    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    //To create a setter
    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings > 0) {
            this.numberOfToppings = numberOfToppings;
        }
    }
    //To create a constructor
    public double calculatePrice() {
        double totalPrice = 0;

        switch (size) {
            case "small":
                totalPrice += 4;
                break;
            case "medium":
                totalPrice += 6;
                break;
            case "large":
                totalPrice += 8;
        }

       totalPrice += numberOfToppings*0.75;

        return totalPrice;
    }

    public String toString(){
        return "The size of your pizza is "+size+"\nThe number of toppings in your pizza is "+numberOfToppings+ "\nThe total cost of you pizza is $"+calculatePrice();
    }


}
