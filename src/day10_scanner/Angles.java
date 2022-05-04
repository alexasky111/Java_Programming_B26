package day10_scanner;
import java.util.Scanner;
public class Angles {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 angle numbers: "); // you could've entered only one statement
        double angle1 = keyboard.nextDouble(); // int is automatically stored in double, but you wouldn't be able to type decimals
        double angle2 = keyboard.nextDouble();
        double angle3 = keyboard.nextDouble();

        double sum1 = angle1+angle2+angle3;

        boolean isTriangle = sum1 == 180;  // instead of num1+num2+num3==180.0  and  num1+num2+num3==360
        boolean isCircle = sum1 == 360;

       //no parenthesis bc comparison comes later


        System.out.println("is a triangle: "+isTriangle);
        System.out.println("is a circle: "+isCircle);


    }
}
