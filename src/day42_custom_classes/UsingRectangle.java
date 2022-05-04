package day42_custom_classes;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 10.5;
        rectangle1.height = 12.5;
        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();

        System.out.println(rectangle1);



    }
}
