package day48_encapsulation;

public class UseSquare {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println(square1);

        //square1.side = 11; cant do it
        square1.setSide(11); //to change the side
        System.out.println(square1.getSide()); //to print and see
        System.out.println(square1);
    }
}
