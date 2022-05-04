package day51_inheritance.shapes;

public class Shape {
    String name;

    public Shape(String name){
        this.name =name;
    }

    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
