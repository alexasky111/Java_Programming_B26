package day65_streams;

public class Item {
    private String name;
    private double price;
    private int stars;

    public Item(String name, double price, int stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
