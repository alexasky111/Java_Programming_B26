package day47_encapsulation.rectangle;

public class Rectangle {
    //To create private instance variables
    private int length;
    private int width;

    //To create a Constructor
    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    //To create a getter
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //To create a setter
    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    //Other instance m-thods
    public int calculateArea(){
       return length*width;
    }
    public int calculatePerimeter(){
        return (2*width)+(2*length);
    }

    //To create toString()
    public String toString(){
        return "The length of the rectangular is "+length+"\nThe width of the rectangular is "+width+"\nThe area of the rectangular is "+calculateArea()+"\nThe perimeter of the rectangular is "+ calculatePerimeter();
    }


}
