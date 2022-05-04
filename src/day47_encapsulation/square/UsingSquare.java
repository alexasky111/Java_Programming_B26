package day47_encapsulation.square;

public class UsingSquare {
    public static void main(String[] args) {
        //To create an obj
        Square square1 = new Square(4);
        //To print the private var-->side value
        System.out.println(square1.getSide());
        //To reassign the value to a private var
        square1.setSide(8);
        //To print the private var-->side w/ a new value
        System.out.println(square1.getSide());
        //To give an invalid value to a private var-->prints an old reassigned value of 8
        square1.setSide(0);
        System.out.println(square1.getSide());

        //To call the instance methods
        System.out.println(square1.calculatePerimeter());
        System.out.println(square1.calculateArea());
        System.out.println(square1);


    }

}
