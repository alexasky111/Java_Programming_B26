package day45_custom_classes;

public class Food {
    /*create a class called Food

        - data:

            name, quantity, unit price, total price
            */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /* - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/
    public Food(String name) {
        this.name = name; // this is the reference to an object instance
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    /*    - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
*/
    public void  calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    public String toString(){
        return "Item: "+ name + " ~ "+quantity+" x "+ unitPrice+ " for a total of $"+ totalPrice;
    }

}
