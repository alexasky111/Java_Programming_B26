package day36_overloading_method;

public class Picture {
    // 1. METHOD 01 Default drawing, no parameter
    public static void draw(){
        System.out.println("trying to draw");
    }

    // 2. METHOD 02 How do you overload a method? --> by having different parameters
    public static void draw(String color) {
        System.out.println("drw w/ "+color);
    }
    // 3. METHOD 03 As long as the param are different btw the methods - I am able to make them there
    public static void draw(String color, String color2){
        System.out.println("drawing w/ "+color+ " and w/ "+color2);
    }

    // 4. METHOD 04
    public static void draw(int size){
        System.out.println("drawing with the size "+size);
    }
    //Not Valid by Changing the Parameter's name, the parameter has to be different each time
    // public static void draw(int size){
    //        System.out.println("drawing with the size "+size);

    // 5. METHOD 05
    public static void draw(int size, String color){
        System.out.println("size first then color");
    }

    // 6. METHOD 06
    public static void draw (String color, int size){
        System.out.println("color first then size");

    }
}
