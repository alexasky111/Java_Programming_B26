package day46_static;

import org.w3c.dom.ls.LSOutput;

public class Iphone {
    String model;
    double price;

    static boolean appleDay;
    static String company;
    static String os;
    static String day;

    //block of code that runs one time in the beginning; it is related to static members/variables
    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";
        //you can run any code:loop,array,if statements
        if(day.equals("Friday")){
            appleDay = true;
        }
    }

    //the objective of a constructor-->to help set the objects; a constructor is about objects, we can't put static
    public Iphone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }
    //toString() is an instance method


    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
