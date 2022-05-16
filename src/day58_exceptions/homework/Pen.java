package day58_exceptions.homework;

public class Pen {
    int inkLevel;
    String inkColor;

    public void write() {
        if (inkLevel >= 10) {
            System.out.println("Writing with pen, 10 ink used");
            inkLevel -= 10;
        } else {
            throw new OutOfInkException("ink should be more than or equal to 10");
        }
    }

    public void changeColor(String color) throws InvalidColorException {

        if (color.equals("black") || color.equals("red") || color.equals("blue")) {
            this.inkColor = color;
            System.out.println("new color is "+inkColor);
        } else {
            throw new InvalidColorException("Ink color must be either black, red, or blue");
        }
    }

      /*  switch (color) {
            case "black":
            case "red":
            case "blue":
                this.inkColor = color;
                break;
            default:
                throw new InvalidColorException("Ink color must be either black, red, or blue");
*/

}

