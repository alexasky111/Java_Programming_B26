package day47_encapsulation.square;

public class Square {
    //To create a private var
    private int side;

//    int perimeter;
//    int area;

    //To create a Constructor
    public Square(int side) {
        System.out.println("Constructor run");
        setSide(side);
    }

    //To create a getter w/ matching return datatype
    public int getSide() {
        return side;
    }

    //To create a setter w/ matching parameters datatype
    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    //To create an instance m-thod calculateArea()
    public int calculateArea(){
        return side * side;
    }


    //To create an instance m-thod calculatePerimeter()
    public int calculatePerimeter(){
        return 4*side;
    }

    public String toString(){
        return "The side of the square is "+side+"\nThe area of the square is "+calculateArea()+"\nThe perimeter of the square is "+calculatePerimeter();
    }
}
