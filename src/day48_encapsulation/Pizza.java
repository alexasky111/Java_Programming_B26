package day48_encapsulation;

public class Pizza {
    private String size;
    private int numOfToppings;

    public Pizza(String size, int numOfToppings){
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings >= 0) {
            this.numOfToppings = numOfToppings;
        }
    }

    public double calculatePrice(){
        if (size==null){
            return -1;
        }
        double price = size.equalsIgnoreCase("small")? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;
        return price + (numOfToppings * 0.75);
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfToppings=" + numOfToppings + " "+calculatePrice()+
                '}';
    }
}
