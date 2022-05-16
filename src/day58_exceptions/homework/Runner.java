package day58_exceptions.homework;

public class Runner {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.inkLevel = 10;
        pen1.write();


        try {
            pen1.changeColor("red");

        } catch (InvalidColorException e) {
            System.out.println("Ink color must be either black, red, or blue");
//           e.printStackTrace();
//           e.getMessage();
        }


        System.out.println(pen1.inkLevel);
        System.out.println(pen1.inkColor);}
}
