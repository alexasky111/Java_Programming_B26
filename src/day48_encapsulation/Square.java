package day48_encapsulation;

public class Square {
    /*
    create a class called Square
        - data:
            side
            */
    private int side;

    /*        - constructor

                - create a constructor that creates a Square object with the side

                    call setter here
                    */
    public Square(int side) {
        setSide(side);
    }
        /* - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable
*/
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if(side>0){
            this.side = side;
        }
    }
       /* - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects
     */
    public int calculateArea(){
        return side * side;
    }

    public int calculatePerimeter(){
        return side *4;
    }


    public String toString(){
        return "Side: "+side+" Area: "+calculateArea()+ " Perimeter: "+calculatePerimeter();
    }
}
