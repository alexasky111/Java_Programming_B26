package day51_inheritance.shapes;

public class Square extends Shape {
    double side;

    public Square(double side) {
        super("Square"); //all square obj will have name->Square
        this.side =side;
    }

    @Override //annotation, it is optional
    public double area(){
        return side * side;
    } //taking a m-thod from a Super Class, but changing an implementation of it

    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }
}
