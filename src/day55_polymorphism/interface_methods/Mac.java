package day55_polymorphism.interface_methods;

public interface Mac {
    String NAME = "Mac"; // public static final variables
    String OS = "IOS";

    void turnOn(); //public abstract

    //Q: How do you create a method w/ implementation in an interface

    //One way is STATIC method:
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println();
    }
    //One way is DEFAULT method: "default" is not an access modifier, it is a method to do implementation
    public  default void faceTime(){
        System.out.println("Opening facetime");
    }
}
