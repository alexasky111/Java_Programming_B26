package day47_encapsulation.rectangle;

public class UsingRectangular {
    public static void main(String[] args) {
        //To create an obj
        Rectangle rectangle1 = new Rectangle(4,5);
        //to print the obj using toString()
        System.out.println(rectangle1);
        //to print the obj w/ getter --> only 4
        System.out.println(rectangle1.getLength());
        //to print the obj w/ getter --> only 5
        rectangle1.setWidth(0);
        System.out.println(rectangle1.getWidth());

        //to call other m-thods
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateArea());

        //to reassign length/width
        rectangle1.setLength(10);
        rectangle1.setWidth(10);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
    }
}
