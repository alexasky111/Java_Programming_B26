package day51_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {
        Square obj1 = new Square(4.5);
        System.out.println(obj1);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());

        Circle obj2 = new Circle(0.5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());
    }
}
