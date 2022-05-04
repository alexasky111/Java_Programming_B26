package day36_overloading_method;

public class Painter {
    public static void main(String[] args) {
        // 1. Calling the first method, bc I have no parameters
        Picture.draw();
        // 2. Calling the 4th method bc has int parameter
        Picture.draw(100);
        // 3. Calling the 2nd method, bc parameter is a string
        Picture.draw("red");
        // 4. Calling the 3rd method, bc 2 String parameters
        Picture.draw("blue", "green");
        // 5. Calling the method 5
        Picture.draw(20,"black");
        // 6. Calling the method 6
        Picture.draw("red", 300);


        String s = "200";
        Picture.draw(s); // Calling the 2nd method w/ a parameter String
    }
}
